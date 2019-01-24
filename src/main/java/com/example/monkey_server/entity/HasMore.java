package com.example.monkey_server.entity;

/**
 * Monkey_Server
 *
 * @author 叶天华
 * @date 2019/1/23 16:32
 * 用于判断是否有更多数据
 */
public class HasMore extends BaseEntity {

    /**
     * 是否有更多数据
     */
    private boolean hasMore;
    /**
     * 下一页
     */
    private Integer nextPage;

    public HasMore(boolean hasMore, Integer nextPage) {
        this.hasMore = hasMore;
        this.nextPage = nextPage;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }
}
