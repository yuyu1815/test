/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.settings;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.settings.JunieProjectPersistentStateComponent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.settings.JunieProjectState;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.ui.DialogPanel;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import java.nio.file.Paths;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\003\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\016\032\0020\017H\027J\b\020\020\032\0020\017H\026J\n\020\021\032\004\030\0010\022H\026J\b\020\023\032\0020\024H\026J\b\020\025\032\0020\026H\026J\b\020\027\032\0020\026H\026J\b\020\030\032\0020\026H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\033\020\b\032\0020\t8BX\002¢\006\f\n\004\b\f\020\r\032\004\b\n\020\013¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieProjectConfigurable;", "Lcom/intellij/openapi/options/SearchableConfigurable;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "settings", "Lcom/intellij/ml/llm/matterhorn/ej/core/settings/JunieProjectPersistentStateComponent;", "panel", "Lcom/intellij/openapi/ui/DialogPanel;", "getPanel", "()Lcom/intellij/openapi/ui/DialogPanel;", "panel$delegate", "Lkotlin/Lazy;", "getId", "", "getDisplayName", "createComponent", "Ljavax/swing/JComponent;", "isModified", "", "apply", "", "reset", "disposeUIResources", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class JunieProjectConfigurable implements SearchableConfigurable {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final JunieProjectPersistentStateComponent settings;
/*    */   
/* 22 */   public JunieProjectConfigurable(@NotNull Project project) { this.project = project;
/* 23 */     this.settings = JunieProjectPersistentStateComponent.Companion.getInstance(this.project);
/* 24 */     this.panel$delegate = LazyKt.lazy(this::panel_delegate$lambda$6); } @NotNull private final Lazy panel$delegate; public static final int $stable = 8; private final DialogPanel getPanel() { Lazy lazy = this.panel$delegate; return (DialogPanel)lazy.getValue(); }
/*    */    private static final DialogPanel panel_delegate$lambda$6(JunieProjectConfigurable this$0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield project : Lcom/intellij/openapi/project/Project;
/*    */     //   4: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   7: dup
/*    */     //   8: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   11: invokevirtual getPath : ()Ljava/lang/String;
/*    */     //   14: dup
/*    */     //   15: ldc 'getPath(...)'
/*    */     //   17: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   20: astore_1
/*    */     //   21: aload_0
/*    */     //   22: aload_1
/*    */     //   23: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieProjectConfigurable;Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
/*    */     //   28: invokestatic panel : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/openapi/ui/DialogPanel;
/*    */     //   31: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 0
/*    */     //   #26	-> 21
/*    */     //   #58	-> 31
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   21	11	1	projectDir	Ljava/lang/String;
/*    */     //   0	32	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieProjectConfigurable;
/*    */   }
/*    */   private static final Unit panel_delegate$lambda$6$lambda$5(JunieProjectConfigurable this$0, String $projectDir, Panel $this$panel) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ldc_w '$this$panel'
/*    */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   7: aload_2
/*    */     //   8: aconst_null
/*    */     //   9: aload_0
/*    */     //   10: aload_1
/*    */     //   11: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieProjectConfigurable;Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
/*    */     //   16: iconst_1
/*    */     //   17: aconst_null
/*    */     //   18: invokestatic row$default : (Lcom/intellij/ui/dsl/builder/Panel;Ljavax/swing/JLabel;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/intellij/ui/dsl/builder/Row;
/*    */     //   21: pop
/*    */     //   22: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   25: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 7
/*    */     //   #58	-> 22
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	26	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieProjectConfigurable;
/*    */     //   0	26	1	$projectDir	Ljava/lang/String;
/*    */     //   0	26	2	$this$panel	Lcom/intellij/ui/dsl/builder/Panel;
/*    */   }
/*    */   private static final Unit panel_delegate$lambda$6$lambda$5$lambda$4(JunieProjectConfigurable this$0, String $projectDir, Row $this$row) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ldc '$this$row'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'junie.project.configurable.projectPath.label'
/*    */     //   9: iconst_0
/*    */     //   10: anewarray java/lang/Object
/*    */     //   13: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   16: invokeinterface label : (Ljava/lang/String;)Lcom/intellij/ui/dsl/builder/Cell;
/*    */     //   21: pop
/*    */     //   22: invokestatic createSingleFolderDescriptor : ()Lcom/intellij/openapi/fileChooser/FileChooserDescriptor;
/*    */     //   25: ldc 'junie.project.configurable.browse.title'
/*    */     //   27: iconst_0
/*    */     //   28: anewarray java/lang/Object
/*    */     //   31: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   34: invokevirtual withTitle : (Ljava/lang/String;)Lcom/intellij/openapi/fileChooser/FileChooserDescriptor;
/*    */     //   37: astore_3
/*    */     //   38: aload_2
/*    */     //   39: aload_3
/*    */     //   40: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   43: aload_3
/*    */     //   44: aload_0
/*    */     //   45: getfield project : Lcom/intellij/openapi/project/Project;
/*    */     //   48: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   53: invokeinterface textFieldWithBrowseButton : (Lcom/intellij/openapi/fileChooser/FileChooserDescriptor;Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function1;)Lcom/intellij/ui/dsl/builder/Cell;
/*    */     //   58: aload_0
/*    */     //   59: aload_1
/*    */     //   60: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieProjectConfigurable;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*    */     //   65: aload_1
/*    */     //   66: aload_0
/*    */     //   67: <illegal opcode> invoke : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieProjectConfigurable;)Lkotlin/jvm/functions/Function1;
/*    */     //   72: invokestatic bindText : (Lcom/intellij/ui/dsl/builder/Cell;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Lcom/intellij/ui/dsl/builder/Cell;
/*    */     //   75: bipush #40
/*    */     //   77: invokestatic columns : (Lcom/intellij/ui/dsl/builder/Cell;I)Lcom/intellij/ui/dsl/builder/Cell;
/*    */     //   80: ldc_w 'junie.project.configurable.projectPath.comment'
/*    */     //   83: iconst_0
/*    */     //   84: anewarray java/lang/Object
/*    */     //   87: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   90: iconst_0
/*    */     //   91: aconst_null
/*    */     //   92: bipush #6
/*    */     //   94: aconst_null
/*    */     //   95: invokestatic comment$default : (Lcom/intellij/ui/dsl/builder/Cell;Ljava/lang/String;ILcom/intellij/ui/dsl/builder/HyperlinkEventAction;ILjava/lang/Object;)Lcom/intellij/ui/dsl/builder/Cell;
/*    */     //   98: pop
/*    */     //   99: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   102: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 6
/*    */     //   #29	-> 22
/*    */     //   #30	-> 25
/*    */     //   #29	-> 37
/*    */     //   #31	-> 38
/*    */     //   #32	-> 39
/*    */     //   #33	-> 44
/*    */     //   #31	-> 53
/*    */     //   #38	-> 58
/*    */     //   #55	-> 75
/*    */     //   #56	-> 80
/*    */     //   #57	-> 99
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   38	65	3	descriptor	Lcom/intellij/openapi/fileChooser/FileChooserDescriptor;
/*    */     //   0	103	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieProjectConfigurable;
/*    */     //   0	103	1	$projectDir	Ljava/lang/String;
/*    */     //   0	103	2	$this$row	Lcom/intellij/ui/dsl/builder/Row;
/*    */   }
/*    */   private static final String panel_delegate$lambda$6$lambda$5$lambda$4$lambda$0(VirtualFile virtualFile) {
/* 35 */     Intrinsics.checkNotNullParameter(virtualFile, "virtualFile"); Intrinsics.checkNotNullExpressionValue(virtualFile.getPath(), "getPath(...)"); return virtualFile.getPath();
/*    */   }
/*    */   
/*    */   private static final String panel_delegate$lambda$6$lambda$5$lambda$4$lambda$2(JunieProjectConfigurable this$0, String $projectDir) {
/* 39 */     String stored = ((JunieProjectState)this$0.settings.getState()).getProjectPath(); int $i$a$-let-JunieProjectConfigurable$panel$2$1$1$2$1 = 0;
/* 40 */     CharSequence charSequence = stored; return (((charSequence == null || StringsKt.isBlank(charSequence))) || Intrinsics.areEqual(stored, ".")) ? 
/* 41 */       $projectDir : 
/*    */       
/* 43 */       Paths.get($projectDir, new String[0]).resolve(stored).normalize().toString();
/*    */   }
/*    */   
/*    */   private static final Unit panel_delegate$lambda$6$lambda$5$lambda$4$lambda$3(String $projectDir, JunieProjectConfigurable this$0, String abs) {
/* 47 */     Intrinsics.checkNotNullParameter(abs, "abs"); String storablePath = Intrinsics.areEqual(abs, $projectDir) ? 
/* 48 */       "." : 
/*    */       
/* 50 */       Paths.get($projectDir, new String[0]).relativize(Paths.get(abs, new String[0])).toString();
/*    */     
/* 52 */     ((JunieProjectState)this$0.settings.getState()).setProjectPath(storablePath);
/* 53 */     return Unit.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NonNls
/*    */   @NotNull
/*    */   public String getId() {
/* 62 */     return "junie.project.settings";
/*    */   } @NotNull
/* 64 */   public String getDisplayName() { return MatterhornBundle.message("junie.project.configurable.name", new Object[0]); } @Nullable
/*    */   public JComponent createComponent() {
/* 66 */     return (JComponent)getPanel();
/*    */   } public boolean isModified() {
/* 68 */     return getPanel().isModified();
/*    */   }
/*    */   public void apply() {
/* 71 */     getPanel().apply();
/*    */   }
/*    */   
/*    */   public void reset() {
/* 75 */     getPanel().reset();
/*    */   }
/*    */   
/*    */   public void disposeUIResources() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\settings\JunieProjectConfigurable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */