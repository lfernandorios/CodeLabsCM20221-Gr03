package co.edu.udea.compumovil.gr03_20221.cl04_android_trivia_fragment

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import co.edu.udea.compumovil.gr03_20221.cl04_android_trivia_fragment.databinding.FragmentTitleBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
                R.layout.fragment_title,container,false)

        binding.playButton.setOnClickListener{ view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
            onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}
