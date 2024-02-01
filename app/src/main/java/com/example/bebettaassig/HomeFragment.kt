package com.example.bebettaassig

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bebettaassig.databinding.FragmentHomeBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var list: ArrayList<PreviewData>
    private lateinit var list1: ArrayList<TickrData>
    private lateinit var list3: ArrayList<SportsData>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentHomeBinding.inflate(layoutInflater)

        matchPreview()
        tickr()
        sports()

        binding.rewards.setOnClickListener {

            val bottom=BottomSheetDialog(requireContext())
            val view=layoutInflater.inflate(R.layout.activity_main,null)

            bottom.setCancelable(true)
            bottom.setContentView(view)
            bottom.show()
        }
        return binding.root
    }


    private fun sports() {
        list3= ArrayList()
        list3.add(SportsData(R.drawable.espanyol,R.drawable.united,"Espanyol","Alt.Madrid","2","0","72 min"))
        list3.add(SportsData(R.drawable.leeds,R.drawable.liverpool,"Leeds Utd","Liverpool","2","2","35 min"))
        list3.add(SportsData(R.drawable.leeds,R.drawable.liverpool,"Leeds Utd","Liverpool","2","2","35 min"))

        binding.matchRecycle.adapter=SportAdapter(requireContext(),list3)
        binding.matchRecycle.layoutManager=
            LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.matchRecycle.setHasFixedSize(true)
    }

    private fun tickr() {
        list1= ArrayList()

        list1.add(TickrData(R.drawable.tick,"USAB"))
        list1.add(TickrData(R.drawable.cir1,"DAL"))
        list1.add(TickrData(R.drawable.cir2,"NCAAF"))
        list1.add(TickrData(R.drawable.cir3,"MADRID"))
        list1.add(TickrData(R.drawable.cir4,"PHI"))

        binding.tickrRecy.adapter=TickrAdapter(requireContext(),list1)
        binding.tickrRecy.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.tickrRecy.setHasFixedSize(true)
    }

    private fun matchPreview() {
        list= ArrayList()

        list.add(PreviewData(R.drawable.champ,R.drawable.prevback,R.drawable.blur,R.drawable.trophy,"BARCELONA","BAYERN MUNCHEN","02:20"))
        list.add(PreviewData(R.drawable.champ,R.drawable.prevback,R.drawable.blur,R.drawable.trophy,"BARCELONA","BAYERN MUNCHEN","02:20"))

        binding.reviewRec.adapter=MatchAdapter(requireContext(),list)
        binding.reviewRec.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.reviewRec.setHasFixedSize(true)
    }


}