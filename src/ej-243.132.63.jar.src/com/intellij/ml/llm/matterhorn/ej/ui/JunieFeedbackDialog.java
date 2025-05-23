/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import com.intellij.ui.dsl.builder.Panel;
/*    */ import feedback.CommonFeedbackSystemData;
/*    */ import feedback.RadioButtonGroupBlock;
/*    */ import feedback.RadioButtonItemData;
/*    */ import feedback.TopLabelBlock;
/*    */ import java.util.List;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import kotlinx.serialization.json.JsonElementKt;
/*    */ import kotlinx.serialization.json.JsonObject;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\f\n\002\030\002\n\002\020\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\000\b\007\030\0002\b\022\004\022\0020\0020\001B\021\022\b\020\003\032\004\030\0010\004¢\006\004\b\005\020\006J\b\020\035\032\0020\036H\024J\026\020&\032\b\022\004\022\0020\f0\"2\006\020'\032\0020(H\024R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\013\032\0020\fXD¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\fXD¢\006\b\n\000\032\004\b\020\020\016R\024\020\021\032\0020\fXD¢\006\b\n\000\032\004\b\022\020\016R\033\020\023\032\0020\0028TX\002¢\006\f\n\004\b\026\020\027\032\004\b\024\020\025R\032\020\030\032\b\022\004\022\0020\0320\031X\004¢\006\b\n\000\032\004\b\033\020\034R\024\020\037\032\0020\fXD¢\006\b\n\000\032\004\b \020\016R\032\020!\032\b\022\004\022\0020#0\"X\004¢\006\b\n\000\032\004\b$\020%¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieFeedbackDialog;", "Lfeedback/BlockBasedFeedbackDialogWithEmail;", "Lfeedback/CommonFeedbackSystemData;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "myFeedbackJsonVersion", "", "getMyFeedbackJsonVersion", "()I", "myFeedbackReportId", "", "getMyFeedbackReportId", "()Ljava/lang/String;", "zendeskFeedbackType", "getZendeskFeedbackType", "zendeskTicketTitle", "getZendeskTicketTitle", "mySystemInfoData", "getMySystemInfoData", "()Lfeedback/CommonFeedbackSystemData;", "mySystemInfoData$delegate", "Lkotlin/Lazy;", "myShowFeedbackSystemInfoDialog", "Lkotlin/Function0;", "", "getMyShowFeedbackSystemInfoDialog", "()Lkotlin/jvm/functions/Function0;", "shouldAutoCloseZendeskTicket", "", "myTitle", "getMyTitle", "myBlocks", "", "Lfeedback/FeedbackBlock;", "getMyBlocks", "()Ljava/util/List;", "computeZendeskTicketTags", "collectedData", "Lkotlinx/serialization/json/JsonObject;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class JunieFeedbackDialog extends BlockBasedFeedbackDialogWithEmail<CommonFeedbackSystemData> {
/*    */   private final int myFeedbackJsonVersion;
/*    */   @NotNull
/*    */   private final String myFeedbackReportId;
/*    */   @NotNull
/*    */   private final String zendeskFeedbackType;
/*    */   @NotNull
/*    */   private final String zendeskTicketTitle;
/*    */   
/* 27 */   public JunieFeedbackDialog(@Nullable Project project) { super(project, false);
/*    */ 
/*    */     
/* 30 */     this.myFeedbackJsonVersion = super.getMyFeedbackJsonVersion() + 1;
/*    */     
/* 32 */     this.myFeedbackReportId = "junie_problem_feedback";
/*    */     
/* 34 */     this.zendeskFeedbackType = "JunieProblemFeedback";
/* 35 */     this.zendeskTicketTitle = "Junie Support Request";
/*    */     
/* 37 */     this.mySystemInfoData$delegate = LazyKt.lazy(JunieFeedbackDialog::mySystemInfoData_delegate$lambda$0);
/*    */ 
/*    */ 
/*    */     
/* 41 */     this.myShowFeedbackSystemInfoDialog = this::myShowFeedbackSystemInfoDialog$lambda$1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 49 */     this.myTitle = "Junie Support Request";
/* 50 */     List<TopLabelBlock> list1 = CollectionsKt.createListBuilder(), list2 = list1; JunieFeedbackDialog junieFeedbackDialog = this; int $i$a$-buildList-JunieFeedbackDialog$myBlocks$1 = 0;
/* 51 */     list2.add(new TopLabelBlock("Junie Support Request"));
/* 52 */     list2.add(new DescriptionBlock("Please, tell us about your experience with Junie."));
/*    */ 
/*    */ 
/*    */     
/* 56 */     RadioButtonItemData[] arrayOfRadioButtonItemData = new RadioButtonItemData[2]; arrayOfRadioButtonItemData[0] = new RadioButtonItemData("Report a bug", "bug"); arrayOfRadioButtonItemData[1] = new RadioButtonItemData("Request a feature", "feature"); RadioButtonGroupBlock groupBlock = new RadioButtonGroupBlock("Choose the type of your feedback:", CollectionsKt.listOf((Object[])arrayOfRadioButtonItemData), 
/* 57 */         "issueType");
/*    */     
/* 59 */     groupBlock.requireAnswer();
/* 60 */     list2.add(new JunieFeedbackDialog$myBlocks$1$1());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 67 */     list2.add(groupBlock);
/* 68 */     list2.add((
/* 69 */         new TextAreaBlock("Fill in the short subject of your issue:", "subject"))
/* 70 */         .requireNotEmpty("Subject must not be empty")
/* 71 */         .setPlaceholder("Example: Problems with License/Feature request on new language"));
/*    */     
/* 73 */     list2.add((
/* 74 */         new TextAreaBlock("Share a detailed description of your request:", "description"))
/* 75 */         .requireNotEmpty("Description must not be empty")
/* 76 */         .setPlaceholder("Please share as much details as you can"));
/*    */     
/* 78 */     if (project != null) {
/* 79 */       list2.add(new AttachmentBlock());
/*    */     }
/*    */     
/* 82 */     junieFeedbackDialog.myBlocks = CollectionsKt.build(list1);
/*    */ 
/*    */     
/* 85 */     init(); }
/*    */   @NotNull private final Lazy mySystemInfoData$delegate;
/*    */   @NotNull private final Function0<Unit> myShowFeedbackSystemInfoDialog;
/*    */   @NotNull private final String myTitle; @NotNull private final List<FeedbackBlock> myBlocks; public static final int $stable = 8; protected int getMyFeedbackJsonVersion() { return this.myFeedbackJsonVersion; } @NotNull protected String getMyFeedbackReportId() { return this.myFeedbackReportId; } @NotNull public String getZendeskFeedbackType() { return this.zendeskFeedbackType; } @NotNull
/* 89 */   protected List<String> computeZendeskTicketTags(@NotNull JsonObject collectedData) { Intrinsics.checkNotNullParameter(collectedData, "collectedData"); JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject((JsonElement)collectedData.get("issueType")).get("bug")); if (Intrinsics.areEqual(((JsonElement)collectedData.get("issueType") != null && (JsonElement)JsonElementKt.getJsonObject((JsonElement)collectedData.get("issueType")).get("bug") != null && JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject((JsonElement)collectedData.get("issueType")).get("bug")) != null) ? JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject((JsonElement)collectedData.get("issueType")).get("bug")).getContent() : null, "true")) {
/* 90 */       return CollectionsKt.listOf("ij_junie_bug");
/*    */     }
/* 92 */     return CollectionsKt.listOf("ij_junie_feature"); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String getZendeskTicketTitle() {
/*    */     return this.zendeskTicketTitle;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected CommonFeedbackSystemData getMySystemInfoData() {
/*    */     Lazy lazy = this.mySystemInfoData$delegate;
/*    */     return (CommonFeedbackSystemData)lazy.getValue();
/*    */   }
/*    */   
/*    */   private static final CommonFeedbackSystemData mySystemInfoData_delegate$lambda$0() {
/*    */     return CommonFeedbackSystemData.Companion.getCurrentData();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected Function0<Unit> getMyShowFeedbackSystemInfoDialog() {
/*    */     return this.myShowFeedbackSystemInfoDialog;
/*    */   }
/*    */   
/*    */   private static final Unit myShowFeedbackSystemInfoDialog$lambda$1(JunieFeedbackDialog this$0) {
/*    */     ShowFeedbackKt.showFeedbackSystemInfoDialog$default(this$0.getMyProject(), this$0.getMySystemInfoData(), null, 4, null);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   protected boolean shouldAutoCloseZendeskTicket() {
/*    */     return false;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected String getMyTitle() {
/*    */     return this.myTitle;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   protected List<FeedbackBlock> getMyBlocks() {
/*    */     return this.myBlocks;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/JunieFeedbackDialog$myBlocks$1$1", "Lfeedback/FeedbackBlock;", "addToPanel", "", "panel", "Lcom/intellij/ui/dsl/builder/Panel;", "ej-ui"})
/*    */   public static final class JunieFeedbackDialog$myBlocks$1$1 implements FeedbackBlock {
/*    */     public void addToPanel(Panel panel) {
/*    */       Intrinsics.checkNotNullParameter(panel, "panel");
/*    */       Panel.row$default(panel, null, JunieFeedbackDialog$myBlocks$1$1::addToPanel$lambda$0, 1, null);
/*    */     }
/*    */     
/*    */     private static final Unit addToPanel$lambda$0(Row $this$row) {
/*    */       Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */       $this$row.browserLink("FAQ", "https://www.jetbrains.com/help/junie/");
/*    */       return Unit.INSTANCE;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\JunieFeedbackDialog.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */