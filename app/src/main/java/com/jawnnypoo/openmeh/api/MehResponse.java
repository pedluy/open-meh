package com.jawnnypoo.openmeh.api;

import com.jawnnypoo.openmeh.data.Deal;
import com.jawnnypoo.openmeh.data.Poll;
import com.jawnnypoo.openmeh.data.Video;

import org.parceler.Parcel;

/**
 * The actual response we get when pulling in the meh deal
 */
@Parcel
public class MehResponse {
    Deal deal;
    Poll poll;
    Video video;

    public MehResponse() {}

    public Deal getDeal() {
        return deal;
    }

    public Poll getPoll() {
        return poll;
    }

    public Video getVideo() {
        return video;
    }

    @Override
    public String toString() {
        return deal.toString();
    }
}
