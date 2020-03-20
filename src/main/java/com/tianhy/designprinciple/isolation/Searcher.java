package com.tianhy.designprinciple.isolation;

/**
 * {@link}
 *
 * @Desc:
 * @Author: thy
 * @CreateTime: 2020/3/12 6:44
 **/
public class Searcher extends AbstractSearcher {

/*
    public Searcher(IPrettyGirl pettyGirl) {
        super(pettyGirl);
    }
*/

    public Searcher(IGoodBody goodBody) {
        super(goodBody);
    }

//    public Searcher(IGreateTemperament greateTemperament) {
//        super(greateTemperament);
//    }

    @Override
    public void show() {
        super.goodBody.goodLooking();
        super.goodBody.niceFigure();
//        super.pettyGirl.greatTemperament();

    }
}
