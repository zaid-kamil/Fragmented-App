package digipodium.myfragmentedapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import digipodium.myfragmentedapp.databinding.FragmentWelcomeBinding;


public class WelcomeFragment extends Fragment {


    private digipodium.myfragmentedapp.databinding.FragmentWelcomeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_welcome, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = FragmentWelcomeBinding.bind(view);
        binding.btnHome.setOnClickListener(v1->{
            NavHostFragment.findNavController(this)
                    .navigate(R.id.action_welcomeFragment3_to_homeFragment2);
        });
    }
}