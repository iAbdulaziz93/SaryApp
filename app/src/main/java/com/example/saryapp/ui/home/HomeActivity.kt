package com.example.saryapp.ui.home

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.saryapp.R
import com.example.saryapp.databinding.ActivityHomeBinding
import com.example.saryapp.helpers.ApplicationBase
import com.example.saryapp.logic.models.banner.BannerModel
import com.example.saryapp.logic.models.catalog.CatalogModel
import com.example.saryapp.logic.network.sary.factory.ApiObserver
import com.example.saryapp.utils.factory.HomeViewModelFactory
import com.google.android.material.snackbar.Snackbar
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var mFactory: HomeViewModelFactory
    private lateinit var mBinding: ActivityHomeBinding
    private lateinit var mViewModel: HomeViewModel
    private val bannersList = ArrayList<SlideModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as ApplicationBase).applicationGraph.inject(this)
        super.onCreate(savedInstanceState)

        mViewModel = ViewModelProvider(this, mFactory)[HomeViewModel::class.java]

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        mBinding.viewModel = mViewModel

        initBanners()
        initCatalog()
    }

    private fun initBanners() {
        mViewModel.getBanners()
            .observe(this, ApiObserver(object : ApiObserver.ChangeListener<BannerModel> {
                override fun onSuccess(dataWrapper: BannerModel?) {

                    dataWrapper!!.result?.forEach { bannersList.add(SlideModel(it.image)) }

                    val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
                    imageSlider.setImageList(bannersList, ScaleTypes.CENTER_CROP)

                    imageSlider.setItemClickListener(object : ItemClickListener {
                        override fun onItemSelected(position: Int) {
                            val link = bannersList[position].imageUrl
                            Toast.makeText(this@HomeActivity, link, Toast.LENGTH_LONG).show()
                        }
                    })
                }

                override fun onFailure(exception: String?) {
                    Snackbar.make(
                        mBinding.root.rootView,
                        exception.toString(),
                        Snackbar.LENGTH_LONG
                    ).show()
                }
            }))
    }

    private fun initCatalog() {
        mViewModel.getCatalog()
            .observe(this, ApiObserver(object : ApiObserver.ChangeListener<CatalogModel> {
                override fun onSuccess(dataWrapper: CatalogModel?) {
                    /** TODO **/
                }

                override fun onFailure(exception: String?) {
                    Snackbar.make(
                        mBinding.root.rootView,
                        exception.toString(),
                        Snackbar.LENGTH_LONG
                    ).show()
                }
            }))
    }
}