/*    */ package feedback;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\004\n\002\020 \n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\b'\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B\031\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\030\032\0020\007H\024J\026\020\031\032\b\022\004\022\0020\0170\0322\006\020\033\032\0020\034H\024J\b\020\035\032\0020\036H\024J\020\020\037\032\0020\0362\006\020 \032\0020!H\024J\b\020\"\032\0020\017H\024R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\f\020\rR\022\020\016\032\0020\017X¦\004¢\006\006\032\004\b\020\020\021R\022\020\022\032\0020\017X¦\004¢\006\006\032\004\b\023\020\021R\024\020\024\032\0020\025X\004¢\006\b\n\000\032\004\b\026\020\027¨\006#"}, d2 = {"Lfeedback/BlockBasedFeedbackDialogWithEmail;", "T", "Lfeedback/SystemDataJsonSerializable;", "Lfeedback/BlockBasedFeedbackDialog;", "myProject", "Lcom/intellij/openapi/project/Project;", "forTest", "", "<init>", "(Lcom/intellij/openapi/project/Project;Z)V", "myFeedbackJsonVersion", "", "getMyFeedbackJsonVersion", "()I", "zendeskTicketTitle", "", "getZendeskTicketTitle", "()Ljava/lang/String;", "zendeskFeedbackType", "getZendeskFeedbackType", "emailBlockWithAgreement", "Lfeedback/EmailBlock;", "getEmailBlockWithAgreement", "()Lfeedback/EmailBlock;", "shouldAutoCloseZendeskTicket", "computeZendeskTicketTags", "", "collectedData", "Lkotlinx/serialization/json/JsonObject;", "sendFeedbackData", "", "addFooterToPanel", "panel", "Lcom/intellij/ui/dsl/builder/Panel;", "collectDataToPlainText", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public abstract class BlockBasedFeedbackDialogWithEmail<T extends SystemDataJsonSerializable> extends BlockBasedFeedbackDialog<T> {
/*    */   private final int myFeedbackJsonVersion;
/*    */   
/* 10 */   public BlockBasedFeedbackDialogWithEmail(@Nullable Project myProject, boolean forTest) { super(myProject, forTest);
/*    */     
/* 12 */     this.myFeedbackJsonVersion = super.getMyFeedbackJsonVersion() + 1;
/*    */ 
/*    */ 
/*    */     
/* 16 */     this.emailBlockWithAgreement = new EmailBlock(myProject, this::emailBlockWithAgreement$lambda$0); } @NotNull private final EmailBlock emailBlockWithAgreement; public static final int $stable = 8; protected int getMyFeedbackJsonVersion() { return this.myFeedbackJsonVersion; } @NotNull protected final EmailBlock getEmailBlockWithAgreement() { return this.emailBlockWithAgreement; } private static final Unit emailBlockWithAgreement$lambda$0(BlockBasedFeedbackDialogWithEmail this$0) { this$0.getMyShowFeedbackSystemInfoDialog().invoke(); return Unit.INSTANCE; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean shouldAutoCloseZendeskTicket() {
/* 26 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   protected List<String> computeZendeskTicketTags(@NotNull JsonObject collectedData) {
/* 38 */     Intrinsics.checkNotNullParameter(collectedData, "collectedData"); return CollectionsKt.emptyList();
/*    */   }
/*    */   
/*    */   protected void sendFeedbackData() {
/* 42 */     JsonObject collectedData = collectDataToJsonObject();
/* 43 */     List<String> zendeskTicketTags = computeZendeskTicketTags(collectedData);
/*    */     
/* 45 */     FeedbackRequestDataWithDetailedAnswer feedbackData = new FeedbackRequestDataWithDetailedAnswer(
/* 46 */         this.emailBlockWithAgreement.getEmailAddressIfSpecified(), 
/* 47 */         getZendeskTicketTitle(), 
/* 48 */         collectDataToPlainText(), 
/* 49 */         "rsch.statistics.feedback.common", 
/* 50 */         shouldAutoCloseZendeskTicket(), 
/* 51 */         zendeskTicketTags, 
/* 52 */         getZendeskFeedbackType(), 
/* 53 */         collectedData);
/*    */     
/* 55 */     GeneralFeedbackSubmitKt.submitFeedback(feedbackData, this::sendFeedbackData$lambda$1, BlockBasedFeedbackDialogWithEmail::sendFeedbackData$lambda$2, 
/*    */ 
/*    */         
/* 58 */         getMyForTest() ? FeedbackRequestType.TEST_REQUEST : FeedbackRequestType.PRODUCTION_REQUEST);
/*    */   } private static final Unit sendFeedbackData$lambda$1(BlockBasedFeedbackDialogWithEmail this$0) { this$0.showThanksNotification();
/*    */     return Unit.INSTANCE; } private static final Unit sendFeedbackData$lambda$2() { return Unit.INSTANCE; }
/*    */   protected void addFooterToPanel(@NotNull Panel panel) {
/* 62 */     Intrinsics.checkNotNullParameter(panel, "panel"); this.emailBlockWithAgreement.addToPanel(panel);
/*    */   }
/*    */   @NotNull
/*    */   protected String collectDataToPlainText() {
/* 66 */     StringBuilder stringBuilder = new StringBuilder();
/*    */     
/* 68 */     for (FeedbackBlock block : getMyBlocks()) {
/* 69 */       if (block instanceof TextDescriptionProvider) {
/* 70 */         ((TextDescriptionProvider)block).collectBlockTextDescription(stringBuilder);
/*    */       }
/*    */     } 
/*    */     
/* 74 */     Intrinsics.checkNotNullExpressionValue(stringBuilder.append('\n'), "append(...)"); stringBuilder.append('\n');
/* 75 */     Intrinsics.checkNotNullExpressionValue(stringBuilder.append('\n'), "append(...)"); stringBuilder.append('\n');
/* 76 */     Intrinsics.checkNotNullExpressionValue(stringBuilder.append(getMySystemInfoData().toString()), "append(...)"); Intrinsics.checkNotNullExpressionValue(stringBuilder.append(getMySystemInfoData().toString()).append('\n'), "append(...)"); stringBuilder.append(getMySystemInfoData().toString()).append('\n');
/* 77 */     Intrinsics.checkNotNullExpressionValue(stringBuilder.toString(), "toString(...)"); return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public abstract String getZendeskTicketTitle();
/*    */   
/*    */   @NotNull
/*    */   public abstract String getZendeskFeedbackType();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\BlockBasedFeedbackDialogWithEmail.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */