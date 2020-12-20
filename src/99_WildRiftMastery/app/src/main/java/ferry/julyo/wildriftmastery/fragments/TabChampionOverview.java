package ferry.julyo.wildriftmastery.fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ferry.julyo.wildriftmastery.ChampionInfoActivity;
import ferry.julyo.wildriftmastery.R;
import ferry.julyo.wildriftmastery.data.Champion;
import com.squareup.picasso.Picasso;


public class TabChampionOverview extends Fragment {

    private TextView nameTextView;
    private TextView titleTextView;
    private TextView loreTextView;
    private Champion champion;
    private TextView tagsTextView;
    private ListView allyTipsListView;
    private ListView enemyTipsListView;

    public static TabChampionOverview newInstance(Champion champion) {
        TabChampionOverview fragment = new TabChampionOverview();
        Bundle args = new Bundle();
        args.putSerializable(ChampionInfoActivity.PARAM_CHAMPION, champion);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            this.champion = (Champion) getArguments().getSerializable(ChampionInfoActivity.PARAM_CHAMPION);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_champion_overview, container, false);
        this.nameTextView = fragmentView.findViewById(R.id.fragment_champion_overview_name_text_view);
        this.titleTextView = fragmentView.findViewById(R.id.fragment_champion_overview_title_text_view);
        this.loreTextView = fragmentView.findViewById(R.id.fragment_champion_overview_lore_text_view);
        this.tagsTextView = fragmentView.findViewById(R.id.fragment_champion_overview_tags_text_view);
        this.allyTipsListView = fragmentView.findViewById(R.id.fragment_champion_overview_ally_tips_list_view);
        this.enemyTipsListView = fragmentView.findViewById(R.id.fragment_champion_overview_enemy_tips_list_view);


        if (this.champion != null) {
            this.nameTextView.setText(this.champion.getName());
            this.titleTextView.setText(this.champion.getTitle());
            this.loreTextView.setText(this.champion.getLore());

            StringBuilder tags = new StringBuilder();
            for (String tag : this.champion.getTags()) {
                tags.append(tag);
                tags.append(", ");
            }

            if (tags.lastIndexOf(", ") == tags.length() - 2) {
                tags.replace(tags.length() - 2, tags.length(), "");
            }

            this.tagsTextView.setText(tags.toString());

            ArrayAdapter<String> allyTipsAdapter = new ArrayAdapter<>(fragmentView.getContext(), R.layout.simple_list_item, this.champion.getAllyTips());
            this.allyTipsListView.setAdapter(allyTipsAdapter);

            ArrayAdapter<String> enemyTipsAdapter = new ArrayAdapter<>(fragmentView.getContext(), R.layout.simple_list_item, this.champion.getEnemyTips());
            this.enemyTipsListView.setAdapter(enemyTipsAdapter);

        }

        return fragmentView;
    }
}
