/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.icons.AllIcons;
/*     */ import com.intellij.ide.actions.RevealFileAction;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornCaches;
/*     */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.components.ServicesKt;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\r\032\0020\016H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$NavigateToCachesAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "parent", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "update", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornToolWindowPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornToolWindowPanel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$NavigateToCachesAction\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,485:1\n31#2,2:486\n31#2,2:488\n*S KotlinDebug\n*F\n+ 1 MatterhornToolWindowPanel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$NavigateToCachesAction\n*L\n445#1:486,2\n452#1:488,2\n*E\n"})
/*     */ final class NavigateToCachesAction
/*     */   extends AnAction
/*     */ {
/*     */   @NotNull
/*     */   private final MatterhornToolWindowPanel parent;
/*     */   
/*     */   public NavigateToCachesAction(@NotNull MatterhornToolWindowPanel parent) {
/* 443 */     super(AllIcons.Actions.Show); this.parent = parent; } @NotNull public final MatterhornToolWindowPanel getParent() { return this.parent; } public void actionPerformed(@NotNull AnActionEvent e) {
/*     */     Object object;
/* 445 */     Intrinsics.checkNotNullParameter(e, "e"); ComponentManager $this$service$iv = (ComponentManager)this.parent.getProject(); int $i$f$service = 0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 486 */     Class<ArtifactRequestExecutorService> serviceClass$iv = ArtifactRequestExecutorService.class;
/* 487 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  MatterhornCaches matterhornCaches = ((ArtifactRequestExecutorService)$this$service$iv.getService(serviceClass$iv)).getCaches();
/*     */     if (((matterhornCaches instanceof com.intellij.ml.llm.matterhorn.FileMatterhornCaches) ? matterhornCaches : null) == null) {
/*     */       (matterhornCaches instanceof com.intellij.ml.llm.matterhorn.FileMatterhornCaches) ? matterhornCaches : null;
/*     */       return;
/*     */     } 
/*     */     Path caches = object.getArtifacts().getParent();
/*     */     RevealFileAction.openFile(caches);
/*     */   }
/*     */   
/*     */   public void update(@NotNull AnActionEvent e) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'e'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield parent : Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */     //   10: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   13: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   16: astore_3
/*     */     //   17: iconst_0
/*     */     //   18: istore #4
/*     */     //   20: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   22: astore #5
/*     */     //   24: aload_3
/*     */     //   25: aload #5
/*     */     //   27: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   32: dup
/*     */     //   33: ifnonnull -> 44
/*     */     //   36: pop
/*     */     //   37: aload_3
/*     */     //   38: aload #5
/*     */     //   40: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   43: athrow
/*     */     //   44: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   47: invokevirtual getCaches : ()Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
/*     */     //   50: astore_2
/*     */     //   51: aload_1
/*     */     //   52: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*     */     //   55: aload_2
/*     */     //   56: instanceof com/intellij/ml/llm/matterhorn/FileMatterhornCaches
/*     */     //   59: ifeq -> 115
/*     */     //   62: aload_2
/*     */     //   63: checkcast com/intellij/ml/llm/matterhorn/FileMatterhornCaches
/*     */     //   66: invokevirtual getArtifacts : ()Ljava/nio/file/Path;
/*     */     //   69: invokeinterface getParent : ()Ljava/nio/file/Path;
/*     */     //   74: dup
/*     */     //   75: ldc 'getParent(...)'
/*     */     //   77: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   80: astore_3
/*     */     //   81: iconst_0
/*     */     //   82: anewarray java/nio/file/LinkOption
/*     */     //   85: astore #4
/*     */     //   87: aload_3
/*     */     //   88: aload #4
/*     */     //   90: aload #4
/*     */     //   92: arraylength
/*     */     //   93: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   96: checkcast [Ljava/nio/file/LinkOption;
/*     */     //   99: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
/*     */     //   102: ifeq -> 115
/*     */     //   105: invokestatic isSupported : ()Z
/*     */     //   108: ifeq -> 115
/*     */     //   111: iconst_1
/*     */     //   112: goto -> 116
/*     */     //   115: iconst_0
/*     */     //   116: invokevirtual setEnabled : (Z)V
/*     */     //   119: aload_1
/*     */     //   120: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*     */     //   123: ldc 'Navigate to Caches'
/*     */     //   125: invokevirtual setText : (Ljava/lang/String;)V
/*     */     //   128: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #452	-> 6
/*     */     //   #488	-> 20
/*     */     //   #489	-> 24
/*     */     //   #452	-> 47
/*     */     //   #453	-> 51
/*     */     //   #454	-> 62
/*     */     //   #454	-> 102
/*     */     //   #455	-> 105
/*     */     //   #453	-> 116
/*     */     //   #456	-> 119
/*     */     //   #457	-> 128
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   20	24	4	$i$f$service	I
/*     */     //   24	20	5	serviceClass$iv	Ljava/lang/Class;
/*     */     //   17	27	3	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   51	78	2	caches	Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
/*     */     //   0	129	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$NavigateToCachesAction;
/*     */     //   0	129	1	e	Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ActionUpdateThread getActionUpdateThread() {
/*     */     return ActionUpdateThread.BGT;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornToolWindowPanel$NavigateToCachesAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */