/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.MatterhornPersistentStateComponent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionMode;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import kotlin.Unit;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\f\032\0020\rH\026J\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\021H\026J\b\020\023\032\0020\024H\026J\b\020\025\032\0020\024H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\033\020\006\032\0020\0078BX\002¢\006\f\n\004\b\n\020\013\032\004\b\b\020\t¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornConfigurable;", "Lcom/intellij/openapi/options/SearchableConfigurable;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "myPanel", "Lcom/intellij/openapi/ui/DialogPanel;", "getMyPanel", "()Lcom/intellij/openapi/ui/DialogPanel;", "myPanel$delegate", "Lkotlin/Lazy;", "createComponent", "Ljavax/swing/JComponent;", "isModified", "", "apply", "", "reset", "getDisplayName", "", "getId", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nMatterhornConfigurable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornConfigurable.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/MatterhornConfigurable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,56:1\n1#2:57\n31#3,2:58\n*S KotlinDebug\n*F\n+ 1 MatterhornConfigurable.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/MatterhornConfigurable\n*L\n18#1:58,2\n*E\n"})
/*    */ public final class MatterhornConfigurable implements SearchableConfigurable {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   
/* 15 */   public MatterhornConfigurable(@NotNull Project project) { this.project = project;
/* 16 */     this.myPanel$delegate = LazyKt.lazy(this::myPanel_delegate$lambda$5); } @NotNull private final Lazy myPanel$delegate; public static final int $stable = 8; private final DialogPanel getMyPanel() { Lazy lazy = this.myPanel$delegate; return (DialogPanel)lazy.getValue(); }
/* 17 */   private static final DialogPanel myPanel_delegate$lambda$5(MatterhornConfigurable this$0) { return BuilderKt.panel(this$0::myPanel_delegate$lambda$5$lambda$4); } private static final Unit myPanel_delegate$lambda$5$lambda$4(MatterhornConfigurable this$0, Panel $this$panel) {
/* 18 */     Intrinsics.checkNotNullParameter($this$panel, "$this$panel"); ComponentManager $this$service$iv = (ComponentManager)this$0.project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 58 */     Class<MatterhornPersistentStateComponent> serviceClass$iv = MatterhornPersistentStateComponent.class;
/* 59 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  MatterhornPersistentStateComponent settings = (MatterhornPersistentStateComponent)$this$service$iv.getService(serviceClass$iv);
/*    */     $this$panel.row(MatterhornBundle.message("settings.executor.to.use", new Object[0]), settings::myPanel_delegate$lambda$5$lambda$4$lambda$3);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit myPanel_delegate$lambda$5$lambda$4$lambda$3(MatterhornPersistentStateComponent $settings, Row $this$row) {
/*    */     Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*    */     ComboBoxKt.bindItem($this$row.comboBox(ExecutionMode.Companion.getEntries(), (ListCellRenderer)new MatterhornConfigurable$myPanel$2$1$1$1()), $settings::myPanel_delegate$lambda$5$lambda$4$lambda$3$lambda$1, $settings::myPanel_delegate$lambda$5$lambda$4$lambda$3$lambda$2);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\n\022\006\022\004\030\0010\0020\001J<\020\003\032\0020\0042\020\020\005\032\f\022\b\b\001\022\004\030\0010\0020\0062\b\020\007\032\004\030\0010\0022\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\013H\026¨\006\r"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/MatterhornConfigurable$myPanel$2$1$1$1", "Lcom/intellij/ui/SimpleListCellRenderer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode;", "customize", "", "list", "Ljavax/swing/JList;", "value", "index", "", "selected", "", "hasFocus", "ej-ui"})
/*    */   public static final class MatterhornConfigurable$myPanel$2$1$1$1 extends SimpleListCellRenderer<ExecutionMode> {
/*    */     public void customize(JList list, ExecutionMode value, int index, boolean selected, boolean hasFocus) {
/*    */       Intrinsics.checkNotNullParameter(list, "list");
/*    */       if (value == null || value.getMessageBundleKey() == null)
/*    */         value.getMessageBundleKey(); 
/*    */       value.getMessageBundleKey().setText(MatterhornBundle.message("settings.execution.mode.default", new Object[0]));
/*    */     }
/*    */   }
/*    */   
/*    */   private static final ExecutionMode myPanel_delegate$lambda$5$lambda$4$lambda$3$lambda$1(MatterhornPersistentStateComponent $settings) {
/*    */     String it = ((MatterhornState)$settings.getState()).getExecutionMode();
/*    */     int $i$a$-let-MatterhornConfigurable$myPanel$2$1$1$2$1 = 0;
/*    */     ((MatterhornState)$settings.getState()).getExecutionMode();
/*    */     return (((MatterhornState)$settings.getState()).getExecutionMode() != null) ? ExecutionMode.Companion.find(it) : null;
/*    */   }
/*    */   
/*    */   private static final Unit myPanel_delegate$lambda$5$lambda$4$lambda$3$lambda$2(MatterhornPersistentStateComponent $settings, ExecutionMode it) {
/*    */     ((MatterhornState)$settings.getState()).setExecutionMode((it != null) ? it.getId() : null);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public JComponent createComponent() {
/*    */     return (JComponent)getMyPanel();
/*    */   }
/*    */   
/*    */   public boolean isModified() {
/*    */     return getMyPanel().isModified();
/*    */   }
/*    */   
/*    */   public void apply() {
/*    */     getMyPanel().apply();
/*    */   }
/*    */   
/*    */   public void reset() {
/*    */     getMyPanel().reset();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getDisplayName() {
/*    */     return MatterhornBundle.message("matterhorn.configurable.name", new Object[0]);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getId() {
/*    */     return "matterhorn.settings";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornConfigurable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */