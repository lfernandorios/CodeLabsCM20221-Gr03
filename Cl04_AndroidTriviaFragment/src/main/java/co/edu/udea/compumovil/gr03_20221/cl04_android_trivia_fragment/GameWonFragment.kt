package co.edu.udea.compumovil.gr03_20221.cl04_android_trivia_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import co.edu.udea.compumovil.gr03_20221.cl04_android_trivia_fragment.databinding.FragmentGameWonBinding


class GameWonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: FragmentGameWonBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_game_won, container, false)
        binding.nextMatchButton.setOnClickListener{view: View->
            view.findNavController()
                .navigate(R.id.action_gameWonFragment_to_gameFragment)}
        return binding.root
    }
}
