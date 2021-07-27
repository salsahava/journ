package id.ac.ui.cs.mobileprogramming.salsahava.journ.ui.list;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.ui.cs.mobileprogramming.salsahava.journ.R;

public class StoryListFragment extends Fragment {
    private static final String TAG = StoryListFragment.class.getSimpleName();
    private StoryListViewModel storyListViewModel;
    private RecyclerView recyclerView;
    private StoryAdapter storyAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_story_list, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initRecyclerView();

        storyListViewModel = new ViewModelProvider(this).get(StoryListViewModel.class);
    }

    private void initRecyclerView() {
        storyAdapter = new StoryAdapter();
        recyclerView = getView().findViewById(R.id.recyclerStory);
        RecyclerView.LayoutManager linearLayout = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayout);
        recyclerView.setAdapter(storyAdapter);
    }

}