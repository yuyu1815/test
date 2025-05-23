/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ import com.intellij.icons.AllIcons;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*     */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornCaches;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.openapi.actionSystem.ActionGroup;
/*     */ import com.intellij.openapi.actionSystem.ActionManager;
/*     */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.actionSystem.DefaultActionGroup;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.components.ServicesKt;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.openapi.ui.Splitter;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.util.containers.MultiMap;
/*     */ import git4idea.GitCommit;
/*     */ import git4idea.commands.GitLineHandler;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.tree.TreePath;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.ArrayDeque;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\020#\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\t\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\f\b\007\030\000 E2\0020\0012\0020\0022\0020\003:\bEFGHIJKLB\017\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\034\032\0020\035H\002J&\020\036\032\0020\0352\006\020\037\032\0020 2\f\020!\032\b\022\004\022\0020 0\"2\006\020#\032\0020$H\002J*\020%\032\0020\0352\n\020&\032\006\022\002\b\0030'2\f\020!\032\b\022\004\022\0020 0\"2\006\020#\032\0020$H\002J\024\020(\032\0020\0352\n\020&\032\006\022\002\b\0030'H\002J\020\020)\032\0020$2\006\020\037\032\0020 H\002J\020\020*\032\0020\0352\006\020+\032\0020 H\002J0\020,\032\0020\0352\006\020\037\032\0020 2\f\020!\032\b\022\004\022\0020 0\"2\006\020#\032\0020$2\b\b\002\020-\032\0020.H\002J\020\020/\032\0020\0352\006\020+\032\0020 H\002J \0200\032\0020\0352\006\0201\032\0020\r2\006\0202\032\0020\0132\b\0203\032\004\030\0010\017J\022\0204\032\0020\0352\n\020&\032\006\022\002\b\0030'J\036\0205\032\004\030\0010 2\006\0206\032\0020 2\n\020&\032\006\022\002\b\0030'H\002J\022\0207\032\004\030\001082\006\0209\032\0020:H\026J\035\020;\032\004\030\0010 2\f\020<\032\b\022\004\022\0020>0=H\002¢\006\002\020?J\b\020@\032\0020AH\002J\016\020B\032\0020\0352\006\020\004\032\0020\005J\016\020C\032\0020\0352\006\020\004\032\0020\005J\b\020D\032\0020\035H\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\b\020\tR\020\020\n\032\004\030\0010\013X\016¢\006\002\n\000R\020\020\f\032\004\030\0010\rX\016¢\006\002\n\000R\020\020\016\032\004\030\0010\017X\016¢\006\002\n\000R\016\020\020\032\0020\021X\004¢\006\002\n\000R\024\020\022\032\b\022\004\022\0020\0210\023X\004¢\006\002\n\000R\016\020\024\032\0020\025X\004¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\016\020\030\032\0020\031X\004¢\006\002\n\000R\020\020\032\032\004\030\0010\033X\016¢\006\002\n\000¨\006M"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "Lcom/intellij/openapi/ui/SimpleToolWindowPanel;", "Lcom/intellij/openapi/actionSystem/DataProvider;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "currentJob", "Lkotlinx/coroutines/Job;", "currentContext", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "projectDescriptionFile", "Lcom/intellij/openapi/vfs/VirtualFile;", "structure", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactsTreeStructure;", "model", "Lcom/intellij/ui/tree/StructureTreeModel;", "tree", "Lcom/intellij/ui/treeStructure/Tree;", "preview", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactPreviewPanel;", "treeExpander", "Lcom/intellij/ide/DefaultTreeExpander;", "lastCommitHash", "Lcom/intellij/vcs/log/Hash;", "installPopUpActions", "", "deleteWithChildrenRecursively", "artifact", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;", "processed", "", "index", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ArtifactIndex;", "deleteWithDependents", "artifactId", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "removeFromCache", "buildArtifactIndex", "deleteDependentsRecursively", "artifactNode", "deleteWithFollowingRecursivelyCore", "include", "", "invalidateNode", "updatePanel", "context", "job", "descriptionFile", "goToArtifact", "findNodeByArtifactId", "node", "getData", "", "dataId", "", "getSelectedArtifactNode", "paths", "", "Ljavax/swing/tree/TreePath;", "([Ljavax/swing/tree/TreePath;)Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;", "createToolbarPanel", "Ljavax/swing/JComponent;", "storeCommitBeforeGeneration", "resetToCommitBeforeGeneration", "dispose", "Companion", "ArtifactIndex", "RerunStepAction", "SynchronizeSourcesAction", "StopAction", "ClearCachesAction", "ResetToCommitBeforeGenerationAction", "NavigateToCachesAction", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nMatterhornToolWindowPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornToolWindowPanel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,485:1\n1863#2,2:486\n944#2,15:491\n1863#2,2:506\n31#3,2:488\n1#4:490\n14#5:508\n14#5:509\n*S KotlinDebug\n*F\n+ 1 MatterhornToolWindowPanel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel\n*L\n141#1:486,2\n213#1:491,15\n213#1:506,2\n164#1:488,2\n303#1:508\n55#1:509\n*E\n"})
/*     */ public final class MatterhornToolWindowPanel extends SimpleToolWindowPanel implements DataProvider, Disposable {
/*     */   public MatterhornToolWindowPanel(@NotNull Project project) {
/*  53 */     super(false, true); this.project = project;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     this.structure = new ArtifactsTreeStructure(this.project);
/*  64 */     this.model = new StructureTreeModel(this.structure, null, this);
/*  65 */     this.tree = new Tree((TreeModel)new AsyncTreeModel((TreeModel)this.model, this));
/*  66 */     this.preview = new ArtifactPreviewPanel(this.project, this);
/*  67 */     this.treeExpander = new DefaultTreeExpander((JTree)this.tree);
/*     */ 
/*     */ 
/*     */     
/*  71 */     this.tree.setRootVisible(false);
/*  72 */     this.tree.setCellRenderer((TreeCellRenderer)new ArtifactNodeRenderer());
/*  73 */     TreeUtil.promiseSelectFirstLeaf((JTree)this.tree);
/*     */     
/*  75 */     this.tree.putClientProperty(FileEditorManagerImpl.OPEN_IN_PREVIEW_TAB, Boolean.valueOf(true));
/*  76 */     this.tree.putClientProperty(AnimatedIcon.ANIMATION_IN_RENDERER_ALLOWED, Boolean.valueOf(true));
/*  77 */     this.tree.addTreeSelectionListener((TreeSelectionListener)new RestoreSelectionListener());
/*     */     
/*  79 */     installPopUpActions();
/*     */     
/*  81 */     EditSourceOnDoubleClickHandler.install$default((JTree)this.tree, null, 2, null);
/*  82 */     EditSourceOnEnterKeyHandler.install((JTree)this.tree);
/*  83 */     TreeUtil.installActions((JTree)this.tree);
/*     */     
/*  85 */     Splitter splitter = (Splitter)new OnePixelSplitter(false);
/*  86 */     splitter.setFirstComponent(ScrollPaneFactory.createScrollPane((Component)this.tree));
/*  87 */     splitter.setSecondComponent(ScrollPaneFactory.createScrollPane(this.preview.getHtmlViewPane()));
/*     */     
/*  89 */     setContent((JComponent)splitter);
/*  90 */     setToolbar(createToolbarPanel());
/*     */     
/*  92 */     this.tree.addTreeSelectionListener(this::_init_$lambda$0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     BuildersKt.launch$default(MatterhornServiceScope.Companion.getScope(this.project), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { Object L$0; int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */             //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */             //   3: astore #4
/*     */             //   5: aload_0
/*     */             //   6: getfield label : I
/*     */             //   9: tableswitch default -> 171, 0 -> 36, 1 -> 72, 2 -> 146
/*     */             //   36: aload_1
/*     */             //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */             //   40: aload_0
/*     */             //   41: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */             //   44: invokestatic access$getCurrentContext$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;)Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */             //   47: dup
/*     */             //   48: ifnull -> 81
/*     */             //   51: aload_0
/*     */             //   52: checkcast kotlin/coroutines/Continuation
/*     */             //   55: aload_0
/*     */             //   56: iconst_1
/*     */             //   57: putfield label : I
/*     */             //   60: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */             //   63: dup
/*     */             //   64: aload #4
/*     */             //   66: if_acmpne -> 77
/*     */             //   69: aload #4
/*     */             //   71: areturn
/*     */             //   72: aload_1
/*     */             //   73: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */             //   76: aload_1
/*     */             //   77: pop
/*     */             //   78: goto -> 82
/*     */             //   81: pop
/*     */             //   82: aload_0
/*     */             //   83: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */             //   86: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */             //   89: invokestatic obtainAIIgnoreChecker : (Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function1;
/*     */             //   92: astore_2
/*     */             //   93: aload_0
/*     */             //   94: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */             //   97: astore_3
/*     */             //   98: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */             //   101: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */             //   104: new com/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$2$1
/*     */             //   107: dup
/*     */             //   108: aload_0
/*     */             //   109: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */             //   112: aload_2
/*     */             //   113: aconst_null
/*     */             //   114: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */             //   117: checkcast kotlin/jvm/functions/Function2
/*     */             //   120: aload_0
/*     */             //   121: checkcast kotlin/coroutines/Continuation
/*     */             //   124: aload_0
/*     */             //   125: aload_3
/*     */             //   126: putfield L$0 : Ljava/lang/Object;
/*     */             //   129: aload_0
/*     */             //   130: iconst_2
/*     */             //   131: putfield label : I
/*     */             //   134: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */             //   137: dup
/*     */             //   138: aload #4
/*     */             //   140: if_acmpne -> 159
/*     */             //   143: aload #4
/*     */             //   145: areturn
/*     */             //   146: aload_0
/*     */             //   147: getfield L$0 : Ljava/lang/Object;
/*     */             //   150: checkcast com/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel
/*     */             //   153: astore_3
/*     */             //   154: aload_1
/*     */             //   155: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */             //   158: aload_1
/*     */             //   159: aload_3
/*     */             //   160: swap
/*     */             //   161: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */             //   164: invokestatic access$setCurrentContext$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;)V
/*     */             //   167: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */             //   170: areturn
/*     */             //   171: new java/lang/IllegalStateException
/*     */             //   174: dup
/*     */             //   175: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */             //   177: invokespecial <init> : (Ljava/lang/String;)V
/*     */             //   180: athrow
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #105	-> 3
/*     */             //   #107	-> 40
/*     */             //   #105	-> 69
/*     */             //   #107	-> 77
/*     */             //   #109	-> 82
/*     */             //   #110	-> 93
/*     */             //   #105	-> 143
/*     */             //   #110	-> 159
/*     */             //   #123	-> 167
/*     */             //   #105	-> 171
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   93	44	2	checker	Lkotlin/jvm/functions/Function1;
/*     */             //   0	181	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$2;
/* 105 */             //   40	131	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(MatterhornToolWindowPanel.this, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Project getProject() {
/*     */     return this.project;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "SELECTED_NODE_KEY", "Lcom/intellij/openapi/actionSystem/DataKey;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;", "getSELECTED_NODE_KEY", "()Lcom/intellij/openapi/actionSystem/DataKey;", "ej-ui"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Logger getLogger() {
/*     */       return MatterhornToolWindowPanel.logger;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final DataKey<ArtifactNode> getSELECTED_NODE_KEY() {
/*     */       return MatterhornToolWindowPanel.SELECTED_NODE_KEY;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int $stable = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static
/*     */   {
/*     */     int $i$f$logger = 0;
/* 509 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(MatterhornToolWindowPanel.class), "getInstance(...)"); } @NotNull private static final DataKey<ArtifactNode> SELECTED_NODE_KEY = DataKey.Companion.create("selectedNode"); private static final void _init_$lambda$0(MatterhornToolWindowPanel this$0, TreeSelectionEvent it) { TreePath selection; Object object1; if (it.getNewLeadSelectionPath() == null) { it.getNewLeadSelectionPath(); return; }  Object object2 = TreeUtil.getLastUserObject(selection); if (((object2 instanceof ArtifactNode) ? object2 : null) == null) { (object2 instanceof ArtifactNode) ? object2 : null; return; }  Artifactual artifact = object1.getArtifact(); object2 = artifact; if (object2 instanceof FailedArtifact) { this$0.preview.showArtifact((FailedArtifact)artifact); } else if (object2 instanceof Artifact) { this$0.preview.showArtifact((Artifact)artifact); } else if (object2 instanceof CancelledArtifact) { this$0.preview.showArtifact((CancelledArtifact)artifact); } else if (object2 == null || object2 instanceof com.intellij.ml.llm.matterhorn.UnfinishedArtifact) { this$0.preview.showArtifactText("", true); } else { throw new NoWhenBranchMatchedException(); }  } private final void installPopUpActions() { List<RerunStepAction> actions = new ArrayList(); actions.add(new RerunStepAction(this, false)); actions.add(new RerunStepAction(this, true)); actions.add(new SynchronizeSourcesAction(this)); Intrinsics.checkNotNullExpressionValue(ActionManager.getInstance().getAction("com.intellij.ml.llm.matterhorn.actions.MatterhornTreeActionGroup"), "getAction(...)"); actions.add(ActionManager.getInstance().getAction("com.intellij.ml.llm.matterhorn.actions.MatterhornTreeActionGroup")); ActionGroup contextActionGroup = (ActionGroup)new DefaultActionGroup(actions); PopupHandler.installPopupMenu((JComponent)this.tree, contextActionGroup, "MatterhornTreePopupActionList"); } @NotNull private static final Logger logger = Logger.getInstance(MatterhornToolWindowPanel.class);
/*     */   
/*     */   private final void deleteWithChildrenRecursively(ArtifactNode artifact, Set<ArtifactNode> processed, ArtifactIndex index) {
/*     */     ArtifactId<?> artifactId;
/*     */     if (!processed.add(artifact))
/*     */       return; 
/*     */     if (artifact.getArtifact() == null || artifact.getArtifact().getId() == null) {
/*     */       artifact.getArtifact().getId();
/*     */       return;
/*     */     } 
/*     */     Iterable<ArtifactNode> $this$forEach$iv = artifact.getChildren();
/*     */     int $i$f$forEach = 0;
/*     */     Iterator<ArtifactNode> iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       ArtifactNode it = (ArtifactNode)element$iv;
/*     */       int $i$a$-forEach-MatterhornToolWindowPanel$deleteWithChildrenRecursively$1 = 0;
/*     */       deleteWithChildrenRecursively(it, processed, index);
/*     */     } 
/*     */     artifact.removeChildren();
/*     */     if (artifact.isReference())
/*     */       return; 
/*     */     deleteWithDependents(artifactId, processed, index);
/*     */   }
/*     */   
/*     */   private final void deleteWithDependents(ArtifactId<?> artifactId, Set processed, ArtifactIndex index) {
/*     */     removeFromCache(artifactId);
/*     */     for (Artifactual dependent : index.getIdToDependents().get(artifactId)) {
/*     */       if (!dependent.getId().isAncestorOf(artifactId))
/*     */         for (ArtifactNode dependentNode : index.getIdToNodes().get(dependent.getId())) {
/*     */           Intrinsics.checkNotNull(dependentNode);
/*     */           deleteWithFollowingRecursivelyCore$default(this, dependentNode, processed, index, false, 8, (Object)null);
/*     */         }  
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void removeFromCache(ArtifactId artifactId) {
/*     */     ComponentManager $this$service$iv = (ComponentManager)this.project;
/*     */     int $i$f$service = 0;
/*     */     Class<ArtifactRequestExecutorService> serviceClass$iv = ArtifactRequestExecutorService.class;
/*     */     if ($this$service$iv.getService(serviceClass$iv) == null) {
/*     */       $this$service$iv.getService(serviceClass$iv);
/*     */       throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv);
/*     */     } 
/*     */     ArtifactRequestExecutorService service = (ArtifactRequestExecutorService)$this$service$iv.getService(serviceClass$iv);
/*     */     MatterhornCaches cache = service.getCaches();
/*     */     cache.remove(CacheType.Artifact, artifactId.toFileName());
/*     */     logger.trace("REMOVE FROM CACHE: " + artifactId);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020%\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\005\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003R!\020\004\032\022\022\b\022\006\022\002\b\0030\006\022\004\022\0020\0070\005¢\006\b\n\000\032\004\b\b\020\tR!\020\n\032\022\022\b\022\006\022\002\b\0030\006\022\004\022\0020\f0\013¢\006\b\n\000\032\004\b\r\020\016R!\020\017\032\022\022\b\022\006\022\002\b\0030\006\022\004\022\0020\0070\013¢\006\b\n\000\032\004\b\020\020\016¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ArtifactIndex;", "", "<init>", "()V", "idToArtifact", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "getIdToArtifact", "()Ljava/util/Map;", "idToNodes", "Lcom/intellij/util/containers/MultiMap;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;", "getIdToNodes", "()Lcom/intellij/util/containers/MultiMap;", "idToDependents", "getIdToDependents", "ej-ui"})
/*     */   private static final class ArtifactIndex {
/*     */     @NotNull
/*     */     private final Map<ArtifactId<?>, Artifactual> idToArtifact = new LinkedHashMap<>();
/*     */     
/*     */     @NotNull
/*     */     public final Map<ArtifactId<?>, Artifactual> getIdToArtifact() {
/*     */       return this.idToArtifact;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private final MultiMap<ArtifactId<?>, ArtifactNode> idToNodes = new MultiMap();
/*     */     
/*     */     @NotNull
/*     */     public final MultiMap<ArtifactId<?>, ArtifactNode> getIdToNodes() {
/*     */       return this.idToNodes;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private final MultiMap<ArtifactId<?>, Artifactual> idToDependents = new MultiMap();
/*     */     
/*     */     @NotNull
/*     */     public final MultiMap<ArtifactId<?>, Artifactual> getIdToDependents() {
/*     */       return this.idToDependents;
/*     */     }
/*     */   }
/*     */   
/*     */   private final ArtifactIndex buildArtifactIndex(ArtifactNode artifact) {
/*     */     ArtifactNode root = artifact;
/*     */     while (true) {
/*     */       if (root.getParent() == null) {
/*     */         root.getParent();
/*     */         break;
/*     */       } 
/*     */     } 
/*     */     ArtifactIndex index = new ArtifactIndex();
/*     */     ArrayDeque deque = new ArrayDeque();
/*     */     deque.addLast(root);
/*     */     while (!deque.isEmpty()) {
/*     */       ArtifactNode node = (ArtifactNode)deque.removeFirst();
/*     */       Artifactual artifactual = node.getArtifact();
/*     */       int $i$a$-let-MatterhornToolWindowPanel$buildArtifactIndex$1 = 0;
/*     */       index.getIdToArtifact().put(artifactual.getId(), artifactual);
/*     */       index.getIdToNodes().putValue(artifactual.getId(), node);
/*     */       node.getArtifact();
/*     */       deque.addAll(node.getChildren());
/*     */     } 
/*     */     for (Artifactual artifactual : index.getIdToArtifact().values()) {
/*     */       for (ArtifactDependency dependency : artifactual.getDependencies())
/*     */         index.getIdToDependents().putValue(dependency.getArtifact(), artifactual); 
/*     */     } 
/*     */     return index;
/*     */   }
/*     */   
/*     */   private final void deleteDependentsRecursively(ArtifactNode artifactNode) {
/*     */     ArtifactIndex index = buildArtifactIndex(artifactNode);
/*     */     deleteWithFollowingRecursivelyCore$default(this, artifactNode, new LinkedHashSet(), index, false, 8, (Object)null);
/*     */   }
/*     */   
/*     */   private final void deleteWithFollowingRecursivelyCore(ArtifactNode artifact, Set processed, ArtifactIndex index, boolean include) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   4: dup
/*     */     //   5: ifnull -> 16
/*     */     //   8: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   13: goto -> 18
/*     */     //   16: pop
/*     */     //   17: aconst_null
/*     */     //   18: astore #5
/*     */     //   20: aload_1
/*     */     //   21: invokevirtual getParent : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   24: dup
/*     */     //   25: ifnull -> 79
/*     */     //   28: astore #8
/*     */     //   30: aload #8
/*     */     //   32: astore #9
/*     */     //   34: iconst_0
/*     */     //   35: istore #10
/*     */     //   37: aload #5
/*     */     //   39: dup
/*     */     //   40: ifnull -> 65
/*     */     //   43: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   46: dup
/*     */     //   47: ifnull -> 65
/*     */     //   50: invokevirtual getRebuildRoot : ()Z
/*     */     //   53: iconst_1
/*     */     //   54: if_icmpne -> 61
/*     */     //   57: iconst_1
/*     */     //   58: goto -> 67
/*     */     //   61: iconst_0
/*     */     //   62: goto -> 67
/*     */     //   65: pop
/*     */     //   66: iconst_0
/*     */     //   67: ifne -> 75
/*     */     //   70: aload #8
/*     */     //   72: goto -> 81
/*     */     //   75: aconst_null
/*     */     //   76: goto -> 81
/*     */     //   79: pop
/*     */     //   80: aconst_null
/*     */     //   81: astore #6
/*     */     //   83: aload #6
/*     */     //   85: ifnull -> 337
/*     */     //   88: aload #6
/*     */     //   90: invokevirtual getChildren : ()Ljava/util/ArrayList;
/*     */     //   93: astore #7
/*     */     //   95: aload #7
/*     */     //   97: checkcast java/util/List
/*     */     //   100: astore #8
/*     */     //   102: iconst_0
/*     */     //   103: istore #9
/*     */     //   105: aload #8
/*     */     //   107: invokeinterface isEmpty : ()Z
/*     */     //   112: ifeq -> 121
/*     */     //   115: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   118: goto -> 276
/*     */     //   121: aload #8
/*     */     //   123: aload #8
/*     */     //   125: invokeinterface size : ()I
/*     */     //   130: invokeinterface listIterator : (I)Ljava/util/ListIterator;
/*     */     //   135: astore #10
/*     */     //   137: aload #10
/*     */     //   139: invokeinterface hasPrevious : ()Z
/*     */     //   144: ifeq -> 268
/*     */     //   147: aload #10
/*     */     //   149: invokeinterface previous : ()Ljava/lang/Object;
/*     */     //   154: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode
/*     */     //   157: astore #11
/*     */     //   159: iconst_0
/*     */     //   160: istore #12
/*     */     //   162: aload #11
/*     */     //   164: aload_1
/*     */     //   165: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   168: ifne -> 175
/*     */     //   171: iconst_1
/*     */     //   172: goto -> 176
/*     */     //   175: iconst_0
/*     */     //   176: ifne -> 137
/*     */     //   179: aload #10
/*     */     //   181: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   186: pop
/*     */     //   187: aload #8
/*     */     //   189: invokeinterface size : ()I
/*     */     //   194: aload #10
/*     */     //   196: invokeinterface nextIndex : ()I
/*     */     //   201: isub
/*     */     //   202: istore #13
/*     */     //   204: iload #13
/*     */     //   206: ifne -> 215
/*     */     //   209: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   212: goto -> 276
/*     */     //   215: new java/util/ArrayList
/*     */     //   218: dup
/*     */     //   219: iload #13
/*     */     //   221: invokespecial <init> : (I)V
/*     */     //   224: astore #14
/*     */     //   226: aload #14
/*     */     //   228: astore #15
/*     */     //   230: iconst_0
/*     */     //   231: istore #16
/*     */     //   233: aload #10
/*     */     //   235: invokeinterface hasNext : ()Z
/*     */     //   240: ifeq -> 259
/*     */     //   243: aload #15
/*     */     //   245: aload #10
/*     */     //   247: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   252: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   255: pop
/*     */     //   256: goto -> 233
/*     */     //   259: nop
/*     */     //   260: aload #14
/*     */     //   262: checkcast java/util/List
/*     */     //   265: goto -> 276
/*     */     //   268: aload #8
/*     */     //   270: checkcast java/lang/Iterable
/*     */     //   273: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   276: checkcast java/lang/Iterable
/*     */     //   279: astore #8
/*     */     //   281: nop
/*     */     //   282: iconst_0
/*     */     //   283: istore #9
/*     */     //   285: aload #8
/*     */     //   287: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   292: astore #10
/*     */     //   294: aload #10
/*     */     //   296: invokeinterface hasNext : ()Z
/*     */     //   301: ifeq -> 336
/*     */     //   304: aload #10
/*     */     //   306: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   311: astore #11
/*     */     //   313: aload #11
/*     */     //   315: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode
/*     */     //   318: astore #12
/*     */     //   320: iconst_0
/*     */     //   321: istore #13
/*     */     //   323: aload_0
/*     */     //   324: aload #12
/*     */     //   326: aload_2
/*     */     //   327: aload_3
/*     */     //   328: invokespecial deleteWithChildrenRecursively : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;Ljava/util/Set;Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ArtifactIndex;)V
/*     */     //   331: nop
/*     */     //   332: nop
/*     */     //   333: goto -> 294
/*     */     //   336: nop
/*     */     //   337: iload #4
/*     */     //   339: ifeq -> 352
/*     */     //   342: aload_0
/*     */     //   343: aload_1
/*     */     //   344: aload_2
/*     */     //   345: aload_3
/*     */     //   346: invokespecial deleteWithChildrenRecursively : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;Ljava/util/Set;Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ArtifactIndex;)V
/*     */     //   349: goto -> 365
/*     */     //   352: aload #5
/*     */     //   354: ifnull -> 365
/*     */     //   357: aload_0
/*     */     //   358: aload #5
/*     */     //   360: aload_2
/*     */     //   361: aload_3
/*     */     //   362: invokespecial deleteWithDependents : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/util/Set;Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ArtifactIndex;)V
/*     */     //   365: aload #6
/*     */     //   367: ifnonnull -> 371
/*     */     //   370: return
/*     */     //   371: aload #5
/*     */     //   373: dup
/*     */     //   374: ifnull -> 399
/*     */     //   377: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   380: dup
/*     */     //   381: ifnull -> 399
/*     */     //   384: invokevirtual getRebuildRoot : ()Z
/*     */     //   387: iconst_1
/*     */     //   388: if_icmpne -> 395
/*     */     //   391: iconst_1
/*     */     //   392: goto -> 401
/*     */     //   395: iconst_0
/*     */     //   396: goto -> 401
/*     */     //   399: pop
/*     */     //   400: iconst_0
/*     */     //   401: ifne -> 416
/*     */     //   404: aload_0
/*     */     //   405: aload #6
/*     */     //   407: aload_2
/*     */     //   408: aload_3
/*     */     //   409: iconst_0
/*     */     //   410: invokespecial deleteWithFollowingRecursivelyCore : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;Ljava/util/Set;Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ArtifactIndex;Z)V
/*     */     //   413: goto -> 422
/*     */     //   416: aload_0
/*     */     //   417: aload #6
/*     */     //   419: invokespecial invalidateNode : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;)V
/*     */     //   422: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #209	-> 0
/*     */     //   #210	-> 20
/*     */     //   #490	-> 34
/*     */     //   #210	-> 37
/*     */     //   #210	-> 67
/*     */     //   #210	-> 79
/*     */     //   #211	-> 83
/*     */     //   #212	-> 88
/*     */     //   #213	-> 95
/*     */     //   #491	-> 105
/*     */     //   #492	-> 115
/*     */     //   #493	-> 121
/*     */     //   #494	-> 137
/*     */     //   #495	-> 147
/*     */     //   #213	-> 162
/*     */     //   #495	-> 176
/*     */     //   #496	-> 179
/*     */     //   #497	-> 187
/*     */     //   #498	-> 204
/*     */     //   #499	-> 215
/*     */     //   #500	-> 233
/*     */     //   #501	-> 243
/*     */     //   #502	-> 259
/*     */     //   #499	-> 260
/*     */     //   #499	-> 265
/*     */     //   #505	-> 268
/*     */     //   #213	-> 281
/*     */     //   #506	-> 285
/*     */     //   #214	-> 323
/*     */     //   #215	-> 331
/*     */     //   #506	-> 332
/*     */     //   #507	-> 336
/*     */     //   #217	-> 337
/*     */     //   #218	-> 342
/*     */     //   #219	-> 352
/*     */     //   #220	-> 357
/*     */     //   #221	-> 365
/*     */     //   #222	-> 371
/*     */     //   #223	-> 404
/*     */     //   #225	-> 416
/*     */     //   #226	-> 422
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   37	30	10	$i$a$-takeUnless-MatterhornToolWindowPanel$deleteWithFollowingRecursivelyCore$parent$1	I
/*     */     //   34	33	9	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   162	14	12	$i$a$-takeLastWhile-MatterhornToolWindowPanel$deleteWithFollowingRecursivelyCore$1	I
/*     */     //   159	17	11	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   233	27	16	$i$a$-apply-CollectionsKt___CollectionsKt$takeLastWhile$1$iv	I
/*     */     //   230	30	15	$this$takeLastWhile_u24lambda_u248$iv	Ljava/util/ArrayList;
/*     */     //   204	64	13	expectedSize$iv	I
/*     */     //   105	171	9	$i$f$takeLastWhile	I
/*     */     //   137	139	10	iterator$iv	Ljava/util/ListIterator;
/*     */     //   102	174	8	$this$takeLastWhile$iv	Ljava/util/List;
/*     */     //   323	9	13	$i$a$-forEach-MatterhornToolWindowPanel$deleteWithFollowingRecursivelyCore$2	I
/*     */     //   320	12	12	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   313	20	11	element$iv	Ljava/lang/Object;
/*     */     //   285	52	9	$i$f$forEach	I
/*     */     //   282	55	8	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   95	242	7	children	Ljava/util/ArrayList;
/*     */     //   20	403	5	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   83	340	6	parent	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   0	423	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */     //   0	423	1	artifact	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   0	423	2	processed	Ljava/util/Set;
/*     */     //   0	423	3	index	Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ArtifactIndex;
/*     */     //   0	423	4	include	Z
/*     */   }
/*     */   
/*     */   private final void invalidateNode(ArtifactNode artifactNode) {
/*     */     if (artifactNode.getArtifact() != null && artifactNode.getArtifact().getId() != null) {
/*     */       ArtifactId<?> it = artifactNode.getArtifact().getId();
/*     */       int $i$a$-let-MatterhornToolWindowPanel$invalidateNode$1 = 0;
/*     */       removeFromCache(it);
/*     */     } else {
/*     */       artifactNode.getArtifact().getId();
/*     */     } 
/*     */     if (artifactNode.getParent() != null) {
/*     */       ArtifactNode it = artifactNode.getParent();
/*     */       int $i$a$-let-MatterhornToolWindowPanel$invalidateNode$2 = 0;
/*     */       invalidateNode(it);
/*     */     } else {
/*     */       artifactNode.getParent();
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void updatePanel(@NotNull RootExecutionContext context, @NotNull Job job, @Nullable VirtualFile descriptionFile) {
/*     */     Intrinsics.checkNotNullParameter(context, "context");
/*     */     Intrinsics.checkNotNullParameter(job, "job");
/*     */     this.currentJob = job;
/*     */     this.currentContext = context;
/*     */     this.projectDescriptionFile = descriptionFile;
/*     */     this.structure.getRootElement().removeChildren();
/*     */     context.addListener(new ArtifactTreeStructureBuilder(context, this.model));
/*     */     this.model.invalidateAsync();
/*     */   }
/*     */   
/*     */   public final void goToArtifact(@NotNull ArtifactId<?> artifactId) {
/*     */     Intrinsics.checkNotNullParameter(artifactId, "artifactId");
/*     */     ArtifactNode it = findNodeByArtifactId(this.structure.getRootElement(), artifactId);
/*     */     int $i$a$-let-MatterhornToolWindowPanel$goToArtifact$1 = 0;
/*     */     this.model.select(it, (JTree)this.tree, MatterhornToolWindowPanel::goToArtifact$lambda$10$lambda$8::goToArtifact$lambda$10$lambda$9);
/*     */     findNodeByArtifactId(this.structure.getRootElement(), artifactId);
/*     */   }
/*     */   
/*     */   private static final Unit goToArtifact$lambda$10$lambda$8(TreePath it) {
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final void goToArtifact$lambda$10$lambda$9(Function1 $tmp0, Object p0) {
/*     */     $tmp0.invoke(p0);
/*     */   }
/*     */   
/*     */   private final ArtifactNode findNodeByArtifactId(ArtifactNode node, ArtifactId<?> artifactId) {
/*     */     node.getArtifact();
/*     */     if (Intrinsics.areEqual((node.getArtifact() != null) ? node.getArtifact().getId() : null, artifactId))
/*     */       return node; 
/*     */     Intrinsics.checkNotNullExpressionValue(node.getChildren().iterator(), "iterator(...)");
/*     */     for (Iterator<ArtifactNode> iterator = node.getChildren().iterator(); iterator.hasNext(); ) {
/*     */       Intrinsics.checkNotNullExpressionValue(iterator.next(), "next(...)");
/*     */       ArtifactNode child = iterator.next();
/*     */       ArtifactNode found = findNodeByArtifactId(child, artifactId);
/*     */       if (found != null)
/*     */         return found; 
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getData(@NotNull String dataId) {
/*     */     Intrinsics.checkNotNullParameter(dataId, "dataId");
/*     */     if (CommonDataKeys.PROJECT.is(dataId))
/*     */       return this.project; 
/*     */     if (CommonDataKeys.NAVIGATABLE.is(dataId) || SELECTED_NODE_KEY.is(dataId)) {
/*     */       TreePath[] it = this.tree.getSelectionPaths();
/*     */       int $i$a$-let-MatterhornToolWindowPanel$getData$1 = 0;
/*     */       this.tree.getSelectionPaths();
/*     */       return (this.tree.getSelectionPaths() != null) ? getSelectedArtifactNode(it) : null;
/*     */     } 
/*     */     return super.getData(dataId);
/*     */   }
/*     */   
/*     */   private final ArtifactNode getSelectedArtifactNode(TreePath[] paths) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore_2
/*     */     //   2: iconst_0
/*     */     //   3: istore_3
/*     */     //   4: aload_2
/*     */     //   5: arraylength
/*     */     //   6: istore #4
/*     */     //   8: iload_3
/*     */     //   9: iload #4
/*     */     //   11: if_icmpge -> 57
/*     */     //   14: aload_2
/*     */     //   15: iload_3
/*     */     //   16: aaload
/*     */     //   17: astore #5
/*     */     //   19: iconst_0
/*     */     //   20: istore #6
/*     */     //   22: aload #5
/*     */     //   24: invokestatic getLastUserObject : (Ljavax/swing/tree/TreePath;)Ljava/lang/Object;
/*     */     //   27: astore #7
/*     */     //   29: aload #7
/*     */     //   31: instanceof com/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode
/*     */     //   34: ifeq -> 45
/*     */     //   37: aload #7
/*     */     //   39: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode
/*     */     //   42: goto -> 46
/*     */     //   45: aconst_null
/*     */     //   46: dup
/*     */     //   47: ifnonnull -> 58
/*     */     //   50: pop
/*     */     //   51: iinc #3, 1
/*     */     //   54: goto -> 8
/*     */     //   57: aconst_null
/*     */     //   58: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #267	-> 0
/*     */     //   #268	-> 22
/*     */     //   #267	-> 46
/*     */     //   #269	-> 58
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   22	24	6	$i$a$-firstNotNullOfOrNull-MatterhornToolWindowPanel$getSelectedArtifactNode$1	I
/*     */     //   19	27	5	it	Ljavax/swing/tree/TreePath;
/*     */     //   0	59	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */     //   0	59	1	paths	[Ljavax/swing/tree/TreePath;
/*     */   }
/*     */   
/*     */   private final JComponent createToolbarPanel() {
/*     */     DefaultActionGroup group = new DefaultActionGroup();
/*     */     group.add(CommonActionsManager.getInstance().createExpandAllAction((TreeExpander)this.treeExpander, (JComponent)this));
/*     */     group.add(CommonActionsManager.getInstance().createCollapseAllAction((TreeExpander)this.treeExpander, (JComponent)this));
/*     */     group.add(new StopAction(this));
/*     */     group.addSeparator();
/*     */     group.add(new NavigateToCachesAction(this));
/*     */     group.add(new ClearCachesAction(this));
/*     */     group.add(new ResetToCommitBeforeGenerationAction(this));
/*     */     group.addSeparator();
/*     */     group.add(ActionManager.getInstance().getAction("com.intellij.ml.llm.matterhorn.actions.MatterhornToolbarActionGroup"));
/*     */     Intrinsics.checkNotNullExpressionValue(ActionManager.getInstance().createActionToolbar("MatterhornToolWindowPanelToolbar", (ActionGroup)group, false), "createActionToolbar(...)");
/*     */     ActionToolbar actionToolBar = ActionManager.getInstance().createActionToolbar("MatterhornToolWindowPanelToolbar", (ActionGroup)group, false);
/*     */     actionToolBar.setTargetComponent((JComponent)this);
/*     */     Intrinsics.checkNotNullExpressionValue(actionToolBar.getComponent(), "getComponent(...)");
/*     */     return actionToolBar.getComponent();
/*     */   }
/*     */   
/*     */   public final void storeCommitBeforeGeneration(@NotNull Project project) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(project));
/*     */     Intrinsics.checkNotNullExpressionValue(GitHistoryUtils.history(project, ProjectUtil.guessProjectDir(project), new String[0]), "history(...)");
/*     */     GitCommit lastCommit = (GitCommit)CollectionsKt.firstOrNull(GitHistoryUtils.history(project, ProjectUtil.guessProjectDir(project), new String[0]));
/*     */     if (lastCommit != null)
/*     */       this.lastCommitHash = lastCommit.getId(); 
/*     */   }
/*     */   
/*     */   public final void resetToCommitBeforeGeneration(@NotNull Project project) {
/*     */     Hash lastCommitHash;
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     if (this.lastCommitHash == null)
/*     */       return; 
/*     */     Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(project));
/*     */     GitLineHandler handler = new GitLineHandler(project, ProjectUtil.guessProjectDir(project), GitCommand.RESET);
/*     */     String[] arrayOfString = new String[1];
/*     */     arrayOfString[0] = "--hard";
/*     */     handler.addParameters(arrayOfString);
/*     */     arrayOfString = new String[1];
/*     */     arrayOfString[0] = lastCommitHash.asString();
/*     */     handler.addParameters(arrayOfString);
/*     */     try {
/*     */       GitCommandResult gitCommandResult = Git.getInstance().runCommand(handler);
/*     */       Intrinsics.checkNotNull(gitCommandResult);
/*     */     } catch (VcsException vcsException) {
/*     */       int $i$f$logger = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(MatterhornToolWindowPanel.class), "getInstance(...)");
/*     */       Logger.getInstance(MatterhornToolWindowPanel.class).error("Git repository can't be reset to the saved revision: " + vcsException.getMessage());
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\007\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\rH\002J\020\020\023\032\0020\r2\006\020\016\032\0020\017H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$RerunStepAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "parent", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "singleStep", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;Z)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "getSingleStep", "()Z", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "performRerunStepAction", "update", "ej-ui"})
/*     */   private static final class RerunStepAction extends AnAction {
/*     */     @NotNull
/*     */     private final MatterhornToolWindowPanel parent;
/*     */     private final boolean singleStep;
/*     */     
/*     */     public RerunStepAction(@NotNull MatterhornToolWindowPanel parent, boolean singleStep) {
/*     */       super(AllIcons.Actions.Rerun);
/*     */       this.parent = parent;
/*     */       this.singleStep = singleStep;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final MatterhornToolWindowPanel getParent() {
/*     */       return this.parent;
/*     */     }
/*     */     
/*     */     public final boolean getSingleStep() {
/*     */       return this.singleStep;
/*     */     }
/*     */     
/*     */     public void actionPerformed(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       performRerunStepAction();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public ActionUpdateThread getActionUpdateThread() {
/*     */       return ActionUpdateThread.EDT;
/*     */     }
/*     */     
/*     */     private final void performRerunStepAction() {
/*     */       TreePath[] it = this.parent.tree.getSelectionPaths();
/*     */       int $i$a$-let-MatterhornToolWindowPanel$RerunStepAction$performRerunStepAction$1 = 0;
/*     */       ArtifactNode selectedNode = this.parent.getSelectedArtifactNode(it);
/*     */       if (selectedNode != null) {
/*     */         if (this.parent.currentJob != null) {
/*     */           Job.DefaultImpls.cancel$default(this.parent.currentJob, null, 1, null);
/*     */         } else {
/*     */           this.parent.currentJob;
/*     */         } 
/*     */         this.parent.currentJob = null;
/*     */         if (!this.singleStep) {
/*     */           this.parent.deleteDependentsRecursively(selectedNode);
/*     */         } else {
/*     */           this.parent.invalidateNode(selectedNode);
/*     */         } 
/*     */         this.parent.model.invalidateAsync();
/*     */         this.parent.tree.updateUI();
/*     */         String str = this.parent.currentContext.getCurrentActionName();
/*     */         int $i$a$-let-MatterhornToolWindowPanel$RerunStepAction$performRerunStepAction$1$1 = 0;
/*     */         MatterhornToolWindowPanelKt.performGenerationAction(this.parent.getProject(), this.parent.projectDescriptionFile, str);
/*     */         this.parent.currentContext.getCurrentActionName();
/*     */       } 
/*     */       this.parent.tree.getSelectionPaths();
/*     */     }
/*     */     
/*     */     public void update(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       Intrinsics.checkNotNull(e.getProject());
/*     */       e.getPresentation().setEnabled(!DumbService.Companion.isDumb(e.getProject()));
/*     */       e.getPresentation().setText(this.singleStep ? "Rerun Single Step" : "Rerun Step");
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\f\032\0020\rH\026J\b\020\016\032\0020\tH\002J\b\020\017\032\0020\020H\002J\020\020\021\032\0020\t2\006\020\n\032\0020\013H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$SynchronizeSourcesAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "parent", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "performSynchronizeSourcesAction", "hasRunConfig", "", "update", "ej-ui"})
/*     */   private static final class SynchronizeSourcesAction extends AnAction {
/*     */     @NotNull
/*     */     private final MatterhornToolWindowPanel parent;
/*     */     
/*     */     public SynchronizeSourcesAction(@NotNull MatterhornToolWindowPanel parent) {
/*     */       super(AllIcons.Actions.Rollback);
/*     */       this.parent = parent;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final MatterhornToolWindowPanel getParent() {
/*     */       return this.parent;
/*     */     }
/*     */     
/*     */     public void actionPerformed(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       performSynchronizeSourcesAction();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public ActionUpdateThread getActionUpdateThread() {
/*     */       return ActionUpdateThread.EDT;
/*     */     }
/*     */     
/*     */     private final void performSynchronizeSourcesAction() {
/*     */       RootExecutionContext context;
/*     */       TreePath[] paths;
/*     */       ArtifactNode selectedNode;
/*     */       if (this.parent.currentContext == null) {
/*     */         this.parent.currentContext;
/*     */         return;
/*     */       } 
/*     */       if (this.parent.tree.getSelectionPaths() == null) {
/*     */         this.parent.tree.getSelectionPaths();
/*     */         return;
/*     */       } 
/*     */       if (this.parent.getSelectedArtifactNode(paths) == null) {
/*     */         this.parent.getSelectedArtifactNode(paths);
/*     */         return;
/*     */       } 
/*     */       Artifactual artifact = selectedNode.getArtifact();
/*     */       int $i$a$-let-MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1 = 0;
/*     */       BuildersKt.launch$default(MatterhornServiceScope.Companion.getScope(this.parent.getProject()), null, null, new MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1(null), 3, null);
/*     */       selectedNode.getArtifact();
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "MatterhornToolWindowPanel.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     static final class MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */       int label;
/*     */       
/*     */       MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1(Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       
/*     */       public final Object invokeSuspend(Object $result) {
/*     */         IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */         switch (this.label) {
/*     */           case 0:
/*     */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */             return Unit.INSTANCE;
/*     */         } 
/*     */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */       }
/*     */       
/*     */       public final Continuation<Unit> create(Object value, Continuation<? super MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1> $completion) {
/*     */         return (Continuation<Unit>)new MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1($completion);
/*     */       }
/*     */       
/*     */       public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */         return ((MatterhornToolWindowPanel$SynchronizeSourcesAction$performSynchronizeSourcesAction$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */     }
/*     */     
/*     */     private final boolean hasRunConfig() {
/*     */       return false;
/*     */     }
/*     */     
/*     */     public void update(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       Intrinsics.checkNotNull(e.getProject());
/*     */       e.getPresentation().setEnabled((!DumbService.Companion.isDumb(e.getProject()) && hasRunConfig()));
/*     */       e.getPresentation().setText("Synchronize Sources");
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\r\032\0020\016H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$StopAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "parent", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "update", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-ui"})
/*     */   private static final class StopAction extends AnAction {
/*     */     @NotNull
/*     */     private final MatterhornToolWindowPanel parent;
/*     */     
/*     */     public StopAction(@NotNull MatterhornToolWindowPanel parent) {
/*     */       super(AllIcons.Actions.Suspend);
/*     */       this.parent = parent;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final MatterhornToolWindowPanel getParent() {
/*     */       return this.parent;
/*     */     }
/*     */     
/*     */     public void actionPerformed(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       if (this.parent.currentJob != null) {
/*     */         Job.DefaultImpls.cancel$default(this.parent.currentJob, null, 1, null);
/*     */       } else {
/*     */         this.parent.currentJob;
/*     */       } 
/*     */       this.parent.currentJob = null;
/*     */     }
/*     */     
/*     */     public void update(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       Job currentJob = this.parent.currentJob;
/*     */       e.getPresentation().setEnabled((currentJob != null && currentJob.isActive()));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public ActionUpdateThread getActionUpdateThread() {
/*     */       return ActionUpdateThread.BGT;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\r\032\0020\016H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ClearCachesAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "parent", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "update", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-ui"})
/*     */   private static final class ClearCachesAction extends AnAction {
/*     */     @NotNull
/*     */     private final MatterhornToolWindowPanel parent;
/*     */     
/*     */     public ClearCachesAction(@NotNull MatterhornToolWindowPanel parent) {
/*     */       super(AllIcons.Actions.ClearCash);
/*     */       this.parent = parent;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final MatterhornToolWindowPanel getParent() {
/*     */       return this.parent;
/*     */     }
/*     */     
/*     */     public void actionPerformed(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       this.parent.structure.getRootElement().removeChildren();
/*     */       this.parent.model.invalidateAsync();
/*     */       this.parent.tree.updateUI();
/*     */       if (this.parent.currentContext != null && this.parent.currentContext.getService() != null && this.parent.currentContext.getService().getCaches() != null) {
/*     */         this.parent.currentContext.getService().getCaches().clear();
/*     */       } else {
/*     */         this.parent.currentContext.getService().getCaches();
/*     */       } 
/*     */     }
/*     */     
/*     */     public void update(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       Job currentJob = this.parent.currentJob;
/*     */       this.parent.currentContext.getService();
/*     */       MatterhornCaches cache = (this.parent.currentContext != null && this.parent.currentContext.getService() != null) ? this.parent.currentContext.getService().getCaches() : null;
/*     */       e.getPresentation().setEnabled(((currentJob == null || !currentJob.isActive()) && cache != null && (cache.hasAnyOfType(CacheType.Artifact) || cache.hasAnyOfType(CacheType.Cache))));
/*     */       e.getPresentation().setText("Clear Caches");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public ActionUpdateThread getActionUpdateThread() {
/*     */       return ActionUpdateThread.BGT;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\t2\006\020\r\032\0020\013H\026J\b\020\016\032\0020\017H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ResetToCommitBeforeGenerationAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "parent", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "actionPerformed", "", "p0", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "update", "e", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-ui"})
/*     */   private static final class ResetToCommitBeforeGenerationAction extends AnAction {
/*     */     @NotNull
/*     */     private final MatterhornToolWindowPanel parent;
/*     */     
/*     */     public ResetToCommitBeforeGenerationAction(@NotNull MatterhornToolWindowPanel parent) {
/*     */       super(AllIcons.Diff.Revert);
/*     */       this.parent = parent;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final MatterhornToolWindowPanel getParent() {
/*     */       return this.parent;
/*     */     }
/*     */     
/*     */     public void actionPerformed(@NotNull AnActionEvent p0) {
/*     */       Intrinsics.checkNotNullParameter(p0, "p0");
/*     */       ApplicationManager.getApplication().executeOnPooledThread(this::actionPerformed$lambda$0);
/*     */     }
/*     */     
/*     */     private static final void actionPerformed$lambda$0(ResetToCommitBeforeGenerationAction this$0) {
/*     */       this$0.parent.resetToCommitBeforeGeneration(this$0.parent.getProject());
/*     */     }
/*     */     
/*     */     public void update(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       e.getPresentation().setEnabled((this.parent.lastCommitHash != null));
/*     */       e.getPresentation().setText("Reset to Commit Before Generation");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public ActionUpdateThread getActionUpdateThread() {
/*     */       return ActionUpdateThread.BGT;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\r\032\0020\016H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$NavigateToCachesAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "parent", "Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "update", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-ui"})
/*     */   @SourceDebugExtension({"SMAP\nMatterhornToolWindowPanel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornToolWindowPanel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$NavigateToCachesAction\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,485:1\n31#2,2:486\n31#2,2:488\n*S KotlinDebug\n*F\n+ 1 MatterhornToolWindowPanel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$NavigateToCachesAction\n*L\n445#1:486,2\n452#1:488,2\n*E\n"})
/*     */   private static final class NavigateToCachesAction extends AnAction {
/*     */     @NotNull
/*     */     private final MatterhornToolWindowPanel parent;
/*     */     
/*     */     public NavigateToCachesAction(@NotNull MatterhornToolWindowPanel parent) {
/*     */       super(AllIcons.Actions.Show);
/*     */       this.parent = parent;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final MatterhornToolWindowPanel getParent() {
/*     */       return this.parent;
/*     */     }
/*     */     
/*     */     public void actionPerformed(@NotNull AnActionEvent e) {
/*     */       Object object;
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       ComponentManager $this$service$iv = (ComponentManager)this.parent.getProject();
/*     */       int $i$f$service = 0;
/*     */       Class<ArtifactRequestExecutorService> serviceClass$iv = ArtifactRequestExecutorService.class;
/*     */       if ($this$service$iv.getService(serviceClass$iv) == null) {
/*     */         $this$service$iv.getService(serviceClass$iv);
/*     */         throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv);
/*     */       } 
/*     */       MatterhornCaches matterhornCaches = ((ArtifactRequestExecutorService)$this$service$iv.getService(serviceClass$iv)).getCaches();
/*     */       if (((matterhornCaches instanceof com.intellij.ml.llm.matterhorn.FileMatterhornCaches) ? matterhornCaches : null) == null) {
/*     */         (matterhornCaches instanceof com.intellij.ml.llm.matterhorn.FileMatterhornCaches) ? matterhornCaches : null;
/*     */         return;
/*     */       } 
/*     */       Path caches = object.getArtifacts().getParent();
/*     */       RevealFileAction.openFile(caches);
/*     */     }
/*     */     
/*     */     public void update(@NotNull AnActionEvent e) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'e'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: getfield parent : Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel;
/*     */       //   10: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */       //   13: checkcast com/intellij/openapi/components/ComponentManager
/*     */       //   16: astore_3
/*     */       //   17: iconst_0
/*     */       //   18: istore #4
/*     */       //   20: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   22: astore #5
/*     */       //   24: aload_3
/*     */       //   25: aload #5
/*     */       //   27: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */       //   32: dup
/*     */       //   33: ifnonnull -> 44
/*     */       //   36: pop
/*     */       //   37: aload_3
/*     */       //   38: aload #5
/*     */       //   40: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */       //   43: athrow
/*     */       //   44: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   47: invokevirtual getCaches : ()Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
/*     */       //   50: astore_2
/*     */       //   51: aload_1
/*     */       //   52: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*     */       //   55: aload_2
/*     */       //   56: instanceof com/intellij/ml/llm/matterhorn/FileMatterhornCaches
/*     */       //   59: ifeq -> 115
/*     */       //   62: aload_2
/*     */       //   63: checkcast com/intellij/ml/llm/matterhorn/FileMatterhornCaches
/*     */       //   66: invokevirtual getArtifacts : ()Ljava/nio/file/Path;
/*     */       //   69: invokeinterface getParent : ()Ljava/nio/file/Path;
/*     */       //   74: dup
/*     */       //   75: ldc 'getParent(...)'
/*     */       //   77: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   80: astore_3
/*     */       //   81: iconst_0
/*     */       //   82: anewarray java/nio/file/LinkOption
/*     */       //   85: astore #4
/*     */       //   87: aload_3
/*     */       //   88: aload #4
/*     */       //   90: aload #4
/*     */       //   92: arraylength
/*     */       //   93: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */       //   96: checkcast [Ljava/nio/file/LinkOption;
/*     */       //   99: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
/*     */       //   102: ifeq -> 115
/*     */       //   105: invokestatic isSupported : ()Z
/*     */       //   108: ifeq -> 115
/*     */       //   111: iconst_1
/*     */       //   112: goto -> 116
/*     */       //   115: iconst_0
/*     */       //   116: invokevirtual setEnabled : (Z)V
/*     */       //   119: aload_1
/*     */       //   120: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*     */       //   123: ldc 'Navigate to Caches'
/*     */       //   125: invokevirtual setText : (Ljava/lang/String;)V
/*     */       //   128: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #452	-> 6
/*     */       //   #488	-> 20
/*     */       //   #489	-> 24
/*     */       //   #452	-> 47
/*     */       //   #453	-> 51
/*     */       //   #454	-> 62
/*     */       //   #454	-> 102
/*     */       //   #455	-> 105
/*     */       //   #453	-> 116
/*     */       //   #456	-> 119
/*     */       //   #457	-> 128
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   20	24	4	$i$f$service	I
/*     */       //   24	20	5	serviceClass$iv	Ljava/lang/Class;
/*     */       //   17	27	3	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */       //   51	78	2	caches	Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
/*     */       //   0	129	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$NavigateToCachesAction;
/*     */       //   0	129	1	e	Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public ActionUpdateThread getActionUpdateThread() {
/*     */       return ActionUpdateThread.BGT;
/*     */     }
/*     */   }
/*     */   
/*     */   public void dispose() {}
/*     */   
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @Nullable
/*     */   private Job currentJob;
/*     */   @Nullable
/*     */   private RootExecutionContext currentContext;
/*     */   @Nullable
/*     */   private VirtualFile projectDescriptionFile;
/*     */   @NotNull
/*     */   private final ArtifactsTreeStructure structure;
/*     */   @NotNull
/*     */   private final StructureTreeModel<ArtifactsTreeStructure> model;
/*     */   @NotNull
/*     */   private final Tree tree;
/*     */   @NotNull
/*     */   private final ArtifactPreviewPanel preview;
/*     */   @NotNull
/*     */   private final DefaultTreeExpander treeExpander;
/*     */   @Nullable
/*     */   private Hash lastCommitHash;
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornToolWindowPanel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */