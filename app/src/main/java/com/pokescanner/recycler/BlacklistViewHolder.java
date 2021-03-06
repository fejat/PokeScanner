/*
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */



package com.pokescanner.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.pokescanner.R;
import com.pokescanner.objects.Pokemons;

/**
 * Created by Brian on 7/21/2016.
 */
public class BlacklistViewHolder extends RecyclerView.ViewHolder {
    TextView pokemonName;
    Switch swt;

    public BlacklistViewHolder(View itemView) {
        super(itemView);

        pokemonName = (TextView) itemView.findViewById(R.id.tvName);
        swt = (Switch) itemView.findViewById(R.id.swt);

        swt.setClickable(true);
    }

    public void bind(final Pokemons pokemons, final BlacklistRecyclerAdapter.onCheckedListener listener) {
        swt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                listener.onChecked(pokemons,b);
            }
        });
    }
}
