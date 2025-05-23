/*     */ package feedback;
/*     */ 
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.ui.DialogPanel;
/*     */ import com.intellij.ui.components.JBScrollPane;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import javax.swing.Action;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.json.JsonObjectBuilder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\007\n\002\020\016\n\000\n\002\020\b\n\002\b\b\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\004\b'\030\000*\b\b\000\020\001*\0020\0022\0020\003B\031\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\006\020)\032\0020#J\b\020*\032\0020+H\024J\020\020,\032\0020#2\006\020-\032\0020.H\024J\b\020/\032\0020#H\024J\b\0200\032\0020#H\024J\b\0201\032\0020#H\024J\b\0202\032\00203H\004J\023\0204\032\b\022\004\022\0020605H\024¢\006\002\0207J\b\0208\032\00206H\024J\b\0209\032\00206H\024R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\f\020\rR\016\020\016\032\0020\017XD¢\006\002\n\000R\024\020\020\032\0020\021X\004¢\006\b\n\000\032\004\b\022\020\023R\022\020\024\032\0020\017X¤\004¢\006\006\032\004\b\025\020\026R\022\020\027\032\0020\017X¤\004¢\006\006\032\004\b\030\020\026R\030\020\031\032\b\022\004\022\0020\0330\032X¤\004¢\006\006\032\004\b\034\020\035R\022\020\036\032\0028\000X¤\004¢\006\006\032\004\b\037\020 R\030\020!\032\b\022\004\022\0020#0\"X¤\004¢\006\006\032\004\b$\020%R\016\020&\032\0020'X\004¢\006\002\n\000R\016\020(\032\0020\017XD¢\006\002\n\000¨\006:"}, d2 = {"Lfeedback/BlockBasedFeedbackDialog;", "T", "Lfeedback/SystemDataJsonSerializable;", "Lcom/intellij/openapi/ui/DialogWrapper;", "myProject", "Lcom/intellij/openapi/project/Project;", "myForTest", "", "<init>", "(Lcom/intellij/openapi/project/Project;Z)V", "getMyProject", "()Lcom/intellij/openapi/project/Project;", "getMyForTest", "()Z", "myFeedbackJsonVersionKey", "", "myFeedbackJsonVersion", "", "getMyFeedbackJsonVersion", "()I", "myFeedbackReportId", "getMyFeedbackReportId", "()Ljava/lang/String;", "myTitle", "getMyTitle", "myBlocks", "", "Lfeedback/FeedbackBlock;", "getMyBlocks", "()Ljava/util/List;", "mySystemInfoData", "getMySystemInfoData", "()Lfeedback/SystemDataJsonSerializable;", "myShowFeedbackSystemInfoDialog", "Lkotlin/Function0;", "", "getMyShowFeedbackSystemInfoDialog", "()Lkotlin/jvm/functions/Function0;", "myJsonConverter", "Lkotlinx/serialization/json/Json;", "mySystemInfoJsonName", "setTitle", "createCenterPanel", "Ljavax/swing/JComponent;", "addFooterToPanel", "panel", "Lcom/intellij/ui/dsl/builder/Panel;", "doOKAction", "sendFeedbackData", "showThanksNotification", "collectDataToJsonObject", "Lkotlinx/serialization/json/JsonObject;", "createActions", "", "Ljavax/swing/Action;", "()[Ljavax/swing/Action;", "getOKAction", "getCancelAction", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nBlockBasedFeedbackDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockBasedFeedbackDialog.kt\nfeedback/BlockBasedFeedbackDialog\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,136:1\n29#2,3:137\n*S KotlinDebug\n*F\n+ 1 BlockBasedFeedbackDialog.kt\nfeedback/BlockBasedFeedbackDialog\n*L\n105#1:137,3\n*E\n"})
/*     */ public abstract class BlockBasedFeedbackDialog<T extends SystemDataJsonSerializable> extends DialogWrapper {
/*     */   @Nullable
/*     */   private final Project myProject;
/*     */   private final boolean myForTest;
/*     */   @NotNull
/*     */   private final String myFeedbackJsonVersionKey;
/*     */   
/*     */   @Nullable
/*  24 */   protected final Project getMyProject() { return this.myProject; } private final int myFeedbackJsonVersion; @NotNull private final Json myJsonConverter; @NotNull
/*  25 */   private final String mySystemInfoJsonName; public static final int $stable = 8; protected final boolean getMyForTest() { return this.myForTest; }
/*  26 */   public BlockBasedFeedbackDialog(@Nullable Project myProject, boolean myForTest) { super(myProject); this.myProject = myProject;
/*     */     this.myForTest = myForTest;
/*  28 */     this.myFeedbackJsonVersionKey = "format_version";
/*     */ 
/*     */     
/*  31 */     this.myFeedbackJsonVersion = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  40 */     this.myJsonConverter = JsonKt.Json$default(null, BlockBasedFeedbackDialog::myJsonConverter$lambda$0, 1, null);
/*     */     
/*  42 */     this.mySystemInfoJsonName = "system_info";
/*     */ 
/*     */     
/*  45 */     setResizable(false); } protected int getMyFeedbackJsonVersion() { return this.myFeedbackJsonVersion; }
/*     */   private static final Unit myJsonConverter$lambda$0(JsonBuilder $this$Json) { Intrinsics.checkNotNullParameter($this$Json, "$this$Json");
/*     */     $this$Json.setPrettyPrint(true);
/*     */     return Unit.INSTANCE; }
/*  49 */   public final void setTitle() { setTitle(getMyTitle()); }
/*     */ 
/*     */   
/*     */   @NotNull
/*  53 */   protected JComponent createCenterPanel() { setTitle();
/*     */     
/*  55 */     DialogPanel dialogPanel1 = BuilderKt.panel(this::createCenterPanel$lambda$1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  61 */     DialogPanel dialog = dialogPanel1; int $i$a$-also-BlockBasedFeedbackDialog$createCenterPanel$mainPanel$2 = 0;
/*  62 */     dialog.setBorder((Border)new JBEmptyBorder(0, 10, 0, 10));
/*     */     
/*     */     DialogPanel mainPanel = dialogPanel1;
/*  65 */     JBScrollPane jBScrollPane1 = new JBScrollPane(
/*  66 */         (Component)mainPanel, 
/*  67 */         20, 
/*  68 */         31);
/*  69 */     JBScrollPane $this$createCenterPanel_u24lambda_u243 = jBScrollPane1; int $i$a$-apply-BlockBasedFeedbackDialog$createCenterPanel$scrollablePane$1 = 0;
/*  70 */     $this$createCenterPanel_u24lambda_u243.setBorder((Border)JBUI.Borders.empty());
/*     */     
/*     */     JBScrollPane scrollablePane = jBScrollPane1;
/*  73 */     DialogPanel dialogPanel2 = BuilderKt.panel(scrollablePane::createCenterPanel$lambda$5);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     DialogPanel $this$createCenterPanel_u24lambda_u246 = dialogPanel2; int $i$a$-apply-BlockBasedFeedbackDialog$createCenterPanel$2 = 0;
/*  79 */     $this$createCenterPanel_u24lambda_u246.registerIntegratedPanel(mainPanel); return (JComponent)dialogPanel2; } private static final Unit createCenterPanel$lambda$1(BlockBasedFeedbackDialog this$0, Panel $this$panel) { Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); for (FeedbackBlock block : this$0.getMyBlocks())
/*     */       block.addToPanel($this$panel);  this$0.addFooterToPanel($this$panel); return Unit.INSTANCE; }
/*     */   private static final Unit createCenterPanel$lambda$5(JBScrollPane $scrollablePane, Panel $this$panel) { Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); Panel.row$default($this$panel, null, $scrollablePane::createCenterPanel$lambda$5$lambda$4, 1, null).resizableRow(); return Unit.INSTANCE; }
/*     */   private static final Unit createCenterPanel$lambda$5$lambda$4(JBScrollPane $scrollablePane, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */     $this$row.cell((JComponent)$scrollablePane).align(Align.FILL);
/*     */     return Unit.INSTANCE; }
/*  85 */   protected void addFooterToPanel(@NotNull Panel panel) { Intrinsics.checkNotNullParameter(panel, "panel"); }
/*     */   
/*     */   protected void doOKAction() {
/*  88 */     super.doOKAction();
/*  89 */     sendFeedbackData();
/*     */   }
/*     */   
/*     */   protected void sendFeedbackData() {
/*  93 */     FeedbackRequestData feedbackData = new FeedbackRequestData(getMyFeedbackReportId(), collectDataToJsonObject());
/*  94 */     GeneralFeedbackSubmitKt.submitFeedback(feedbackData, this::sendFeedbackData$lambda$7, BlockBasedFeedbackDialog::sendFeedbackData$lambda$8, 
/*     */ 
/*     */         
/*  97 */         this.myForTest ? FeedbackRequestType.TEST_REQUEST : FeedbackRequestType.PRODUCTION_REQUEST);
/*     */   } private static final Unit sendFeedbackData$lambda$7(BlockBasedFeedbackDialog this$0) {
/*     */     this$0.showThanksNotification();
/*     */     return Unit.INSTANCE;
/*     */   } private static final Unit sendFeedbackData$lambda$8() {
/*     */     return Unit.INSTANCE;
/*     */   } protected void showThanksNotification() {} @NotNull
/*     */   protected final JsonObject collectDataToJsonObject() {
/* 105 */     int $i$f$buildJsonObject = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     JsonObjectBuilder builder$iv = new JsonObjectBuilder();
/* 138 */     JsonObjectBuilder $this$collectDataToJsonObject_u24lambda_u249 = builder$iv; int $i$a$-buildJsonObject-BlockBasedFeedbackDialog$collectDataToJsonObject$1 = 0; JsonElementBuildersKt.put($this$collectDataToJsonObject_u24lambda_u249, "feedback_id", getMyFeedbackReportId()); JsonElementBuildersKt.put($this$collectDataToJsonObject_u24lambda_u249, this.myFeedbackJsonVersionKey, Integer.valueOf(getMyFeedbackJsonVersion())); for (FeedbackBlock block : getMyBlocks()) { if (block instanceof JsonDataProvider)
/* 139 */         ((JsonDataProvider)block).collectBlockDataToJson($this$collectDataToJsonObject_u24lambda_u249);  }  $this$collectDataToJsonObject_u24lambda_u249.put(this.mySystemInfoJsonName, getMySystemInfoData().serializeToJson(this.myJsonConverter)); return builder$iv.build();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected Action[] createActions() {
/*     */     Action[] arrayOfAction = new Action[2];
/*     */     arrayOfAction[0] = getCancelAction();
/*     */     arrayOfAction[1] = getOKAction();
/*     */     return arrayOfAction;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected Action getOKAction() {
/*     */     return (Action)new BlockBasedFeedbackDialog$getOKAction$1(this);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\017\n\000\n\002\030\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0060\001R\0020\002¨\006\003"}, d2 = {"feedback/BlockBasedFeedbackDialog$getOKAction$1", "Lcom/intellij/openapi/ui/DialogWrapper$OkAction;", "Lcom/intellij/openapi/ui/DialogWrapper;", "ej-ui"})
/*     */   public static final class BlockBasedFeedbackDialog$getOKAction$1 extends DialogWrapper.OkAction {
/*     */     BlockBasedFeedbackDialog$getOKAction$1(BlockBasedFeedbackDialog $receiver) {
/*     */       super($receiver);
/*     */       putValue("Name", "Send Feedback");
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected Action getCancelAction() {
/*     */     Intrinsics.checkNotNullExpressionValue(super.getCancelAction(), "getCancelAction(...)");
/*     */     Action cancelAction = super.getCancelAction();
/*     */     cancelAction.putValue("Name", "Cancel");
/*     */     return cancelAction;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected abstract String getMyFeedbackReportId();
/*     */   
/*     */   @NotNull
/*     */   protected abstract String getMyTitle();
/*     */   
/*     */   @NotNull
/*     */   protected abstract List<FeedbackBlock> getMyBlocks();
/*     */   
/*     */   @NotNull
/*     */   protected abstract T getMySystemInfoData();
/*     */   
/*     */   @NotNull
/*     */   protected abstract Function0<Unit> getMyShowFeedbackSystemInfoDialog();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\BlockBasedFeedbackDialog.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */