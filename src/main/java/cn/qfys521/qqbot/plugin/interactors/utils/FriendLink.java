package cn.qfys521.qqbot.plugin.interactors.utils;



import java.util.ArrayList;

public class FriendLink {
    private ArrayList<Link> links = new ArrayList<>();

    public ArrayList<Link> getLinks() {
        if (links == null){
            return links = new ArrayList<>();
        }
        return links;
    }
}
