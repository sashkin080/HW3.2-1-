package ru.netology.domain;

public class WallVk {
    private int id;
    private int ownerID;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;
    private  Views views;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean can_edit;
    private int isPinned;
    private boolean marked_as_ads;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;
    // + get/set на все поля
}
