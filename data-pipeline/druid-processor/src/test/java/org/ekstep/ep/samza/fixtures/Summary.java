package org.ekstep.ep.samza.fixtures;

public class Summary {
    /**
     * Valid Summary Event
     */
    public static final String VALID_EVENT = "{\"eid\":\"ME_WORKFLOW_SUMMARY\",\"ets\":1551409245701,\"syncts\":1551245418895,\"ver\":\"1.0\",\"mid\":\"4E12E343B0FD99D17490C1BD0DB69B4F\",\"uid\":\"8ec91293-21d8-4af3-aeaa-275b35dc8c98\",\"context\":{\"pdata\":{\"id\":\"AnalyticsDataPipeline\",\"ver\":\"1.0\",\"model\":\"WorkflowSummarizer\"},\"granularity\":\"SESSION\",\"date_range\":{\"from\":1551244161206,\"to\":1551245418814},\"rollup\":{},\"cdata\":[{\"id\":\"9d282a8cbaf1546462a4851691b3bc00\",\"type\":\"ContentSession\"}]},\"dimensions\":{\"did\":\"518bab62deac8129f563077b4f1ba516\",\"pdata\":{\"id\":\"staging.diksha.portal\",\"ver\":\"1.11.0\",\"pid\":\"sunbird-portal.contenteditor.contentplayer\"},\"sid\":\"nlYPjt8_GoxB8LDtldOChvz7YH3odbKH\",\"channel\":\"0124784842112040965\",\"type\":\"content\",\"mode\":\"edit\"},\"edata\":{\"eks\":{\"interact_events_per_min\":6.57,\"start_time\":1551244161206,\"interact_events_count\":63,\"item_responses\":[],\"end_time\":1551245418814,\"events_summary\":[{\"id\":\"START\",\"count\":1},{\"id\":\"IMPRESSION\",\"count\":21},{\"id\":\"INTERACT\",\"count\":63},{\"id\":\"END\",\"count\":1}],\"page_summary\":[{\"id\":\"d9a95168-3e15-4aac-91e6-b8505116a497\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":193.83,\"visit_count\":1},{\"id\":\"c0e843b3-ec91-42ed-8e21-21250d1cb205\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":15.07,\"visit_count\":1},{\"id\":\"aaada2d5-6199-40d5-a85c-e2c778e8b18e\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":2.06,\"visit_count\":1},{\"id\":\"5d710ee4-b589-49bb-ad1d-8c1d08e6a83a\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":17.33,\"visit_count\":1},{\"id\":\"62481bee-3d01-4d5c-b0e9-50b837056604\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":12.75,\"visit_count\":1},{\"id\":\"6cb0248e-b9ae-4beb-817a-0ec86b638d07\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":119.6,\"visit_count\":1},{\"id\":\"36a9709b-e218-49b4-a19c-1a44947ab84d\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":113.67,\"visit_count\":1},{\"id\":\"dcd4adc7-7959-45c5-8aa5-0a75b269850d\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":1365.73,\"visit_count\":1},{\"id\":\"c40dd5a6-6375-42c7-8ce1-dba65a8a1826\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":5.36,\"visit_count\":1},{\"id\":\"2b0278a0-6673-4ba0-9ba9-17b5bcc619d0\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":35.19,\"visit_count\":1},{\"id\":\"244d4eee-17d4-4bad-8be3-0a8849dea53c\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":19.36,\"visit_count\":1},{\"id\":\"5786c403-d267-4329-a61a-3dccc466a4ed\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":9.07,\"visit_count\":1}],\"time_diff\":1257.61,\"telemetry_version\":\"3.0\",\"env_summary\":[{\"env\":\"contentplayer\",\"time_spent\":1909.02,\"count\":1}],\"time_spent\":575.19}},\"tags\":[],\"object\":{\"id\":\"do_21268948156283289611498\",\"type\":\"Content\",\"ver\":\"2\"}}";

    /**
     * Invalid dimension data type Event
     */
    public static final String INVALID_EVENT= "{\"eid\":\"ME_WORKFLOW_SUMMARY\",\"ets\":1551409245701,\"syncts\":1551245418895,\"ver\":\"1.0\",\"mid\":\"4E12E343B0FD99D17490C1BD0DB69B4F\",\"uid\":\"8ec91293-21d8-4af3-aeaa-275b35dc8c98\",\"context\":{\"pdata\":{\"id\":\"AnalyticsDataPipeline\",\"ver\":\"1.0\",\"model\":\"WorkflowSummarizer\"},\"granularity\":\"SESSION\",\"date_range\":{\"from\":1551244161206,\"to\":1551245418814},\"rollup\":{},\"cdata\":[{\"id\":\"9d282a8cbaf1546462a4851691b3bc00\",\"type\":\"ContentSession\"}]},\"dimensions\":[],\"edata\":{\"eks\":{\"interact_events_per_min\":6.57,\"start_time\":1551244161206,\"interact_events_count\":63,\"item_responses\":[],\"end_time\":1551245418814,\"events_summary\":[{\"id\":\"START\",\"count\":1},{\"id\":\"IMPRESSION\",\"count\":21},{\"id\":\"INTERACT\",\"count\":63},{\"id\":\"END\",\"count\":1}],\"page_summary\":[{\"id\":\"d9a95168-3e15-4aac-91e6-b8505116a497\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":193.83,\"visit_count\":1},{\"id\":\"c0e843b3-ec91-42ed-8e21-21250d1cb205\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":15.07,\"visit_count\":1},{\"id\":\"aaada2d5-6199-40d5-a85c-e2c778e8b18e\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":2.06,\"visit_count\":1},{\"id\":\"5d710ee4-b589-49bb-ad1d-8c1d08e6a83a\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":17.33,\"visit_count\":1},{\"id\":\"62481bee-3d01-4d5c-b0e9-50b837056604\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":12.75,\"visit_count\":1},{\"id\":\"6cb0248e-b9ae-4beb-817a-0ec86b638d07\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":119.6,\"visit_count\":1},{\"id\":\"36a9709b-e218-49b4-a19c-1a44947ab84d\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":113.67,\"visit_count\":1},{\"id\":\"dcd4adc7-7959-45c5-8aa5-0a75b269850d\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":1365.73,\"visit_count\":1},{\"id\":\"c40dd5a6-6375-42c7-8ce1-dba65a8a1826\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":5.36,\"visit_count\":1},{\"id\":\"2b0278a0-6673-4ba0-9ba9-17b5bcc619d0\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":35.19,\"visit_count\":1},{\"id\":\"244d4eee-17d4-4bad-8be3-0a8849dea53c\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":19.36,\"visit_count\":1},{\"id\":\"5786c403-d267-4329-a61a-3dccc466a4ed\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":9.07,\"visit_count\":1}],\"time_diff\":1257.61,\"telemetry_version\":\"3.0\",\"env_summary\":[{\"env\":\"contentplayer\",\"time_spent\":1909.02,\"count\":1}],\"time_spent\":575.19}},\"tags\":[],\"object\":{\"id\":\"do_21268948156283289611498\",\"type\":\"Content\",\"ver\":\"2\"}}";

    /**
     * Invalid Tags data type
     */
    public static final String INVALID_EVENT_CASE_1 ="{\"eid\":\"ME_WORKFLOW_SUMMARY\",\"ets\":1551409245701,\"syncts\":\"1551245418895\",\"ver\":\"1.0\",\"mid\":\"4E12E343B0FD99D17490C1BD0DB69B4F\",\"uid\":\"8ec91293-21d8-4af3-aeaa-275b35dc8c98\",\"context\":{\"pdata\":{\"id\":\"AnalyticsDataPipeline\",\"ver\":\"1.0\",\"model\":\"WorkflowSummarizer\"},\"granularity\":\"SESSION\",\"date_range\":{\"from\":1551244161206,\"to\":1551245418814},\"rollup\":{},\"cdata\":[{\"id\":\"9d282a8cbaf1546462a4851691b3bc00\",\"type\":\"ContentSession\"}]},\"dimensions\":{\"did\":\"518bab62deac8129f563077b4f1ba516\",\"pdata\":{\"id\":\"staging.diksha.portal\",\"ver\":\"1.11.0\",\"pid\":\"sunbird-portal.contenteditor.contentplayer\"},\"sid\":\"nlYPjt8_GoxB8LDtldOChvz7YH3odbKH\",\"channel\":\"0124784842112040965\",\"type\":\"content\",\"mode\":\"edit\"},\"edata\":{\"eks\":{\"interact_events_per_min\":6.57,\"start_time\":1551244161206,\"interact_events_count\":63,\"item_responses\":[],\"end_time\":1551245418814,\"events_summary\":[{\"id\":\"START\",\"count\":1},{\"id\":\"IMPRESSION\",\"count\":21},{\"id\":\"INTERACT\",\"count\":63},{\"id\":\"END\",\"count\":1}],\"page_summary\":[{\"id\":\"d9a95168-3e15-4aac-91e6-b8505116a497\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":193.83,\"visit_count\":1},{\"id\":\"c0e843b3-ec91-42ed-8e21-21250d1cb205\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":15.07,\"visit_count\":1},{\"id\":\"aaada2d5-6199-40d5-a85c-e2c778e8b18e\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":2.06,\"visit_count\":1},{\"id\":\"5d710ee4-b589-49bb-ad1d-8c1d08e6a83a\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":17.33,\"visit_count\":1},{\"id\":\"62481bee-3d01-4d5c-b0e9-50b837056604\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":12.75,\"visit_count\":1},{\"id\":\"6cb0248e-b9ae-4beb-817a-0ec86b638d07\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":119.6,\"visit_count\":1},{\"id\":\"36a9709b-e218-49b4-a19c-1a44947ab84d\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":113.67,\"visit_count\":1},{\"id\":\"dcd4adc7-7959-45c5-8aa5-0a75b269850d\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":1365.73,\"visit_count\":1},{\"id\":\"c40dd5a6-6375-42c7-8ce1-dba65a8a1826\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":5.36,\"visit_count\":1},{\"id\":\"2b0278a0-6673-4ba0-9ba9-17b5bcc619d0\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":35.19,\"visit_count\":1},{\"id\":\"244d4eee-17d4-4bad-8be3-0a8849dea53c\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":19.36,\"visit_count\":1},{\"id\":\"5786c403-d267-4329-a61a-3dccc466a4ed\",\"type\":\"workflow\",\"env\":\"contentplayer\",\"time_spent\":9.07,\"visit_count\":1}],\"time_diff\":1257.61,\"telemetry_version\":\"3.0\",\"env_summary\":[{\"env\":\"contentplayer\",\"time_spent\":1909.02,\"count\":1}],\"time_spent\":575.19}},\"tags\":{},\"object\":{\"id\":\"do_21268948156283289611498\",\"type\":\"Content\",\"ver\":\"2\"}}";
    /**
     * Invalid Tags data type
     */
    public static final String INVALID_SUMMARY ="{\"eid\":\"ME_MONITOR_SUMMARY\",\"ets\":1553830612140,\"syncts\":1553817602545,\"ver\":\"2.1\",\"mid\":\"6ED077D95C3B097547544DFF127F647E\",\"uid\":\"\",\"channel\":\"\",\"context\":{\"pdata\":{\"id\":\"AnalyticsDataPipeline\",\"ver\":\"1.0\",\"model\":\"MonitorSummarizer\"},\"granularity\":\"DAY\",\"date_range\":{\"from\":1553817602545,\"to\":1553830609569}},\"dimensions\":{\"period\":20190329},\"edata\":{\"eks\":{\"total_events_generated\":2013,\"jobs_failed_count\":0,\"jobs_summary\":[{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"WorkFlowSummaryModel\",\"tag\":\"\",\"time_taken\":8,\"output_count\":52,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":38518,\"day\":20190329},{\"model\":\"LearnerSessionSummaryModel\",\"tag\":\"\",\"time_taken\":5,\"output_count\":21,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":38518,\"day\":20190329},{\"model\":\"ItemSummaryModel\",\"tag\":\"\",\"time_taken\":4,\"output_count\":6,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":21,\"day\":20190329},{\"model\":\"ItemUsageSummaryModel\",\"tag\":\"\",\"time_taken\":6,\"output_count\":24,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":6,\"day\":20190329},{\"model\":\"UsageSummaryModel\",\"tag\":\"\",\"time_taken\":5,\"output_count\":68,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":21,\"day\":20190329},{\"model\":\"UpdateItemSummaryDB\",\"tag\":\"\",\"time_taken\":1,\"output_count\":96,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":24,\"day\":20190329},{\"model\":\"WorkFlowUsageSummaryModel\",\"tag\":\"\",\"time_taken\":5,\"output_count\":348,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":52,\"day\":20190329},{\"model\":\"DeviceSummaryModel\",\"tag\":\"\",\"time_taken\":3,\"output_count\":3,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":38570,\"day\":20190329},{\"model\":\"UpdateDeviceProfileDB\",\"tag\":\"\",\"time_taken\":0,\"output_count\":1,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":3,\"day\":20190329},{\"model\":\"UpdateWorkFlowUsageDB\",\"tag\":\"\",\"time_taken\":1,\"output_count\":1392,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":348,\"day\":20190329},{\"model\":\"UpdateWorkFlowUsageMetricsModel\",\"tag\":\"\",\"time_taken\":0,\"output_count\":1,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":348,\"day\":20190329},{\"model\":\"UpdatePortalMetrics\",\"tag\":\"\",\"time_taken\":1,\"output_count\":1,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"DialcodeUsageSummaryModel\",\"tag\":\"\",\"time_taken\":12,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":38518,\"day\":20190329},{\"model\":\"ETBCoverageSummaryModel\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"UpdateDialcodeUsageDB\",\"tag\":\"\",\"time_taken\":1,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"VideoStreamingJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329},{\"model\":\"DataExhaustJob\",\"tag\":\"\",\"time_taken\":0,\"output_count\":0,\"model_id\":\"AnalyticsDataPipeline\",\"status\":\"SUCCESS\",\"input_count\":0,\"day\":20190329}],\"total_ts\":52,\"jobs_completed_count\":38,\"jobs_start_count\":38}},\"ts\":\"2019-03-29T03:36:52.140+0000\",\"ldata\":{\"country_code\":\"\",\"country\":\"\",\"city\":\"\",\"state\":\"\",\"state_code\":\"\"},\"flags\":{\"ldata_retrieved\":false}}";

    public static final String UASPEC_SUMMARY="{\"actor\":{\"type\":\"User\",\"id\":\"4c4530df-0d4f-42a5-bd91-0366716c8c24\"},\"edata\":{\"id\":\"content-detail\",\"type\":\"OTHER\",\"pageid\":\"content-detail\",\"subtype\":\"detail\",\"extra\":{\"values\":[{\"isDownloaded\":true,\"isUpdateAvailable\":false}]}},\"eid\":\"INTERACT\",\"ver\":\"3.0\",\"ets\":1551344686294,\"context\":{\"pdata\":{\"ver\":\"2.0.localstaging-debug\",\"pid\":\"sunbird.app\",\"id\":\"staging.diksha.app\"},\"channel\":\"01231711180382208027\",\"env\":\"home\",\"did\":\"6c61348dc9841f27c96f4887b64ee1f777d74c38\",\"sid\":\"cef2d0be-83fc-4988-8ad9-1b72399e6d3a\",\"cdata\":[]},\"mid\":\"3318a611-50fa-4ae9-9167-7b4390a62b9f\",\"object\":{\"id\":\"do_21228031946955980819\",\"type\":\"Worksheet\",\"version\":\"1.0\",\"rollup\":{\"l4\":\"do_21270636501657190413450\",\"l1\":\"do_21270636097196032013440\",\"l2\":\"do_21270636501655552013444\",\"l3\":\"do_21270636501657190413448\"}},\"tags\":[],\"syncts\":1551344699388,\"@timestamp\":\"2019-02-28T09:04:59.388Z\",\"flags\":{\"tv_processed\":true,\"dd_processed\":true,\"device_location_retrieved\":true,\"user_location_retrieved\":false,\"content_data_retrieved\":true,\"user_data_retrieved\":true,\"device_data_retrieved\":true},\"type\":\"events\",\"ts\":\"2019-02-28T09:04:46.294+0000\",\"devicedata\":{\"statecustomcode\":\"KA\",\"country\":\"India\",\"city\":\"Banglore\",\"countrycode\":\"IND\",\"state\":\"Karnataka\",\"statecode\":\"\",\"districtcustom\":\"\",\"statecustomname\":\"\",\"uaspec\":{\"platform\":123,\"ver\":\"\"},\"firstaccess\":1545920698694},\"userdata\":{\"district\":\"\",\"state\":\"\",\"subject\":[\"English\"],\"grade\":[\"KG\",\"Class 1\",\"Class 2\",\"Class 3\",\"Class 4\",\"Class 5\",\"Class 6\",\"Class 7\",\"Class 8\",\"Class 9\",\"Class 10\",\"Class 11\",\"Class 12\",\"Other\"],\"language\":[\"English\",\"Gujarati\",\"Hindi\"]},\"contentdata\":{\"pkgversion\":1,\"language\":[\"Assamese\"],\"lastpublishedon\":1499851249497,\"contenttype\":\"Resource\",\"lastupdatedon\":1499851152176,\"framework\":\"NCF\",\"name\":\"Test review process\",\"mimetype\":\"application/vnd.ekstep.ecml-archive\",\"objecttype\":\"Content\",\"mediatype\":\"content\",\"status\":\"Live\"}}";

}
