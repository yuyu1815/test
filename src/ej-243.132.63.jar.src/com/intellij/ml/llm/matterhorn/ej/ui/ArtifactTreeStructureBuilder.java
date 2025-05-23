/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000x\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020%\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020#\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\007\b\007\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\026\020\027\032\0020\0222\f\020\030\032\b\022\002\b\003\030\0010\021H\002J\036\020\031\032\0020\0322\006\020\033\032\0020\0342\f\020\035\032\b\022\002\b\003\030\0010\021H\026J\020\020\036\032\0020\0322\006\020\033\032\0020\034H\026J\024\020\037\032\0020\0322\n\020\033\032\006\022\002\b\0030 H\026J\020\020!\032\0020\0322\006\020\033\032\0020\"H\026J\020\020#\032\0020\0322\006\020\033\032\0020$H\026J\024\020%\032\0020\0322\n\020&\032\0060'j\002`(H\026J \020)\032\0020\0322\n\020&\032\0060*j\002`+2\n\020,\032\006\022\002\b\0030\021H\026J\036\020-\032\0020\0322\006\020\033\032\0020\0342\f\020\035\032\b\022\002\b\003\030\0010\021H\002J\020\020.\032\0020\0322\006\020\033\032\0020\034H\002J\020\020/\032\0020\0322\006\020\033\032\0020\034H\002J\b\0200\032\0020\032H\002J \0201\032\0020\0322\n\020,\032\006\022\002\b\0030\0212\n\020&\032\0060*j\002`+H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\023\020\013\032\0070\006¢\006\002\b\fX\004¢\006\002\n\000R\016\020\r\032\0020\016X\004¢\006\002\n\000R\036\020\017\032\022\022\b\022\006\022\002\b\0030\021\022\004\022\0020\0220\020X\004¢\006\002\n\000R\036\020\023\032\022\022\b\022\006\022\002\b\0030\021\022\004\022\0020\0220\020X\004¢\006\002\n\000R\030\020\024\032\f\022\b\022\006\022\002\b\0030\0210\025X\004¢\006\002\n\000R\020\020\026\032\004\030\0010\022X\016¢\006\002\n\000¨\0062"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "model", "Lcom/intellij/ui/tree/StructureTreeModel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactsTreeStructure;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lcom/intellij/ui/tree/StructureTreeModel;)V", "getContext", "()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "structure", "Lorg/jetbrains/annotations/NotNull;", "project", "Lcom/intellij/openapi/project/Project;", "unfinishedNodes", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;", "finishedNodes", "loadedNodes", "", "rootNode", "resolveArtifactNode", "parentArtifactId", "onUnfinishedArtifactCreated", "", "artifact", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "requester", "onUnfinishedArtifactUpdated", "onArtifactFinished", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "onArtifactCancelled", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "onArtifactFailed", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "onCancellation", "e", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "onException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "artifactId", "onUnfinishedArtifactCreatedInternal", "onUnfinishedArtifactUpdatedInternal", "onArtifactFinishedInternal", "onCancellationInternal", "onExceptionInternal", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nArtifactTreeStructureBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArtifactTreeStructureBuilder.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1863#2:202\n1734#2,3:203\n1864#2:206\n1863#2,2:207\n1863#2,2:210\n1#3:209\n*S KotlinDebug\n*F\n+ 1 ArtifactTreeStructureBuilder.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder\n*L\n111#1:202\n112#1:203,3\n111#1:206\n157#1:207,2\n195#1:210,2\n*E\n"})
/*     */ public final class ArtifactTreeStructureBuilder implements RootExecutionContextListener {
/*     */   @NotNull
/*     */   private final RootExecutionContext context;
/*     */   @NotNull
/*     */   private final StructureTreeModel<ArtifactsTreeStructure> model;
/*     */   @NotNull
/*     */   private final ArtifactsTreeStructure structure;
/*     */   @NotNull
/*     */   private final Project project;
/*     */   
/*  21 */   public ArtifactTreeStructureBuilder(@NotNull RootExecutionContext context, @NotNull StructureTreeModel<ArtifactsTreeStructure> model) { this.context = context; this.model = model;
/*     */     
/*  23 */     Intrinsics.checkNotNullExpressionValue(this.model.getTreeStructure(), "getTreeStructure(...)"); this.structure = (ArtifactsTreeStructure)this.model.getTreeStructure();
/*  24 */     this.project = this.context.getService().getProject();
/*  25 */     this.unfinishedNodes = new LinkedHashMap<>();
/*  26 */     this.finishedNodes = new LinkedHashMap<>();
/*  27 */     this.loadedNodes = new LinkedHashSet<>(); }
/*     */   @NotNull private final Map<ArtifactId<?>, ArtifactNode> unfinishedNodes;
/*     */   @NotNull private final Map<ArtifactId<?>, ArtifactNode> finishedNodes;
/*     */   @NotNull private final Set<ArtifactId<?>> loadedNodes;
/*     */   @Nullable private ArtifactNode rootNode;
/*  32 */   public static final int $stable = 8; @NotNull public final RootExecutionContext getContext() { return this.context; } public void onTrajectoryElement(@NotNull TrajectoryElement element, @NotNull ExecutionContext context) { RootExecutionContextListener.DefaultImpls.onTrajectoryElement(this, element, context); } public void onCustomEvent(@NotNull CustomArtifactEvent event, @Nullable ArtifactId requester) { RootExecutionContextListener.DefaultImpls.onCustomEvent(this, event, requester); } public void onContextRegistering(@NotNull RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextRegistering(this, context); } public void onContextClosed(@NotNull RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextClosed(this, context); } private final ArtifactNode resolveArtifactNode(ArtifactId parentArtifactId) { if ((ArtifactNode)this.finishedNodes.get(parentArtifactId) == null) { (ArtifactNode)this.finishedNodes.get(parentArtifactId); if ((ArtifactNode)this.unfinishedNodes.get(parentArtifactId) == null) { (ArtifactNode)this.unfinishedNodes.get(parentArtifactId); throw new IllegalStateException("Unresolved parent node with id=" + 
/*  33 */             parentArtifactId); }
/*     */        }
/*     */     
/*     */     return this.finishedNodes.get(parentArtifactId); } public void onUnfinishedArtifactCreated(@NotNull Artifactual artifact, @Nullable ArtifactId requester) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'artifact'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: aload_2
/*     */     //   12: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;Lcom/intellij/ml/llm/matterhorn/Artifactual;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Ljava/lang/Runnable;
/*     */     //   17: invokeinterface invokeLater : (Ljava/lang/Runnable;)V
/*     */     //   22: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #37	-> 6
/*     */     //   #40	-> 22
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	23	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;
/*     */     //   0	23	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   0	23	2	requester	Lcom/intellij/ml/llm/matterhorn/ArtifactId; }
/*     */   private static final void onUnfinishedArtifactCreated$lambda$0(ArtifactTreeStructureBuilder this$0, Artifactual $artifact, ArtifactId<?> $requester) {
/*  38 */     this$0.onUnfinishedArtifactCreatedInternal($artifact, $requester);
/*     */   }
/*     */   public void onUnfinishedArtifactUpdated(@NotNull Artifactual artifact) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'artifact'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;Lcom/intellij/ml/llm/matterhorn/Artifactual;)Ljava/lang/Runnable;
/*     */     //   16: invokeinterface invokeLater : (Ljava/lang/Runnable;)V
/*     */     //   21: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #43	-> 6
/*     */     //   #46	-> 21
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;
/*     */     //   0	22	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */   }
/*     */   private static final void onUnfinishedArtifactUpdated$lambda$1(ArtifactTreeStructureBuilder this$0, Artifactual $artifact) {
/*  44 */     this$0.onUnfinishedArtifactUpdatedInternal($artifact);
/*     */   }
/*     */   public void onArtifactFinished(@NotNull Artifact artifact) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'artifact'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;Lcom/intellij/ml/llm/matterhorn/Artifact;)Ljava/lang/Runnable;
/*     */     //   16: invokeinterface invokeLater : (Ljava/lang/Runnable;)V
/*     */     //   21: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 6
/*     */     //   #52	-> 21
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;
/*     */     //   0	22	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */   }
/*     */   private static final void onArtifactFinished$lambda$2(ArtifactTreeStructureBuilder this$0, Artifact $artifact) {
/*  50 */     this$0.onArtifactFinishedInternal((Artifactual)$artifact);
/*     */   }
/*     */   public void onArtifactCancelled(@NotNull CancelledArtifact artifact) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'artifact'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;)Ljava/lang/Runnable;
/*     */     //   16: invokeinterface invokeLater : (Ljava/lang/Runnable;)V
/*     */     //   21: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #55	-> 6
/*     */     //   #58	-> 21
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;
/*     */     //   0	22	1	artifact	Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;
/*     */   }
/*     */   private static final void onArtifactCancelled$lambda$3(ArtifactTreeStructureBuilder this$0, CancelledArtifact $artifact) {
/*  56 */     this$0.onArtifactFinishedInternal((Artifactual)$artifact);
/*     */   }
/*     */   public void onArtifactFailed(@NotNull FailedArtifact artifact) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'artifact'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   9: aload_0
/*     */     //   10: aload_1
/*     */     //   11: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;Lcom/intellij/ml/llm/matterhorn/FailedArtifact;)Ljava/lang/Runnable;
/*     */     //   16: invokeinterface invokeLater : (Ljava/lang/Runnable;)V
/*     */     //   21: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #61	-> 6
/*     */     //   #64	-> 21
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;
/*     */     //   0	22	1	artifact	Lcom/intellij/ml/llm/matterhorn/FailedArtifact;
/*     */   }
/*     */   private static final void onArtifactFailed$lambda$4(ArtifactTreeStructureBuilder this$0, FailedArtifact $artifact) {
/*  62 */     this$0.onArtifactFinishedInternal((Artifactual)$artifact);
/*     */   }
/*     */   
/*     */   public void onCancellation(@NotNull CancellationException e)
/*     */   {
/*  67 */     Intrinsics.checkNotNullParameter(e, "e"); ApplicationManager.getApplication().invokeLater(this::onCancellation$lambda$5); } private static final void onCancellation$lambda$5(ArtifactTreeStructureBuilder this$0) {
/*  68 */     this$0.onCancellationInternal();
/*     */   }
/*     */   public void onException(@NotNull Exception e, @NotNull ArtifactId artifactId) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'e'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'artifactId'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   15: aload_0
/*     */     //   16: aload_2
/*     */     //   17: aload_1
/*     */     //   18: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/Exception;)Ljava/lang/Runnable;
/*     */     //   23: invokeinterface invokeLater : (Ljava/lang/Runnable;)V
/*     */     //   28: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #73	-> 12
/*     */     //   #76	-> 28
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	29	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;
/*     */     //   0	29	1	e	Ljava/lang/Exception;
/*     */     //   0	29	2	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */   }
/*     */   private static final void onException$lambda$6(ArtifactTreeStructureBuilder this$0, ArtifactId<?> $artifactId, Exception $e) {
/*  74 */     this$0.onExceptionInternal($artifactId, $e);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final void onUnfinishedArtifactCreatedInternal(Artifactual artifact, ArtifactId<?> requester) {
/*  80 */     if (this.loadedNodes.contains(artifact.getId())) {
/*     */       return;
/*     */     }
/*  83 */     ArtifactNode currentNode = null;
/*  84 */     if (this.rootNode == null) {
/*  85 */       boolean bool = (requester == null) ? true : false; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/*  86 */        currentNode = new ArtifactNode(this.project, this.structure.getRootElement(), artifact);
/*  87 */       this.structure.getRootElement().add(currentNode);
/*  88 */       this.rootNode = currentNode;
/*     */     } else {
/*     */       
/*  91 */       boolean bool = (requester != null) ? true : false; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/*  92 */        ArtifactNode parent = resolveArtifactNode(requester);
/*  93 */       ArtifactNode child = new ArtifactNode(this.project, parent, artifact);
/*  94 */       parent.add(child);
/*  95 */       currentNode = child;
/*     */     } 
/*  97 */     this.unfinishedNodes.put(artifact.getId(), currentNode);
/*     */     
/*  99 */     if (currentNode.getParent() != null) { ArtifactNode parent = currentNode.getParent(); int $i$a$-let-ArtifactTreeStructureBuilder$onUnfinishedArtifactCreatedInternal$1 = 0;
/* 100 */       this.model.invalidateAsync(parent, true); }
/*     */     else
/*     */     { currentNode.getParent(); }
/*     */   
/*     */   }
/*     */   private final void onUnfinishedArtifactUpdatedInternal(Artifactual artifact) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield loadedNodes : Ljava/util/Set;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   10: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   15: ifeq -> 19
/*     */     //   18: return
/*     */     //   19: aload_0
/*     */     //   20: getfield unfinishedNodes : Ljava/util/Map;
/*     */     //   23: aload_1
/*     */     //   24: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   29: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   34: dup
/*     */     //   35: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   38: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode
/*     */     //   41: astore_2
/*     */     //   42: aload_2
/*     */     //   43: aload_1
/*     */     //   44: invokevirtual setArtifact : (Lcom/intellij/ml/llm/matterhorn/Artifactual;)V
/*     */     //   47: aload_1
/*     */     //   48: invokeinterface getDependencies : ()Ljava/util/List;
/*     */     //   53: checkcast java/lang/Iterable
/*     */     //   56: astore_3
/*     */     //   57: iconst_0
/*     */     //   58: istore #4
/*     */     //   60: aload_3
/*     */     //   61: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   66: astore #5
/*     */     //   68: aload #5
/*     */     //   70: invokeinterface hasNext : ()Z
/*     */     //   75: ifeq -> 413
/*     */     //   78: aload #5
/*     */     //   80: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   85: astore #6
/*     */     //   87: aload #6
/*     */     //   89: checkcast com/intellij/ml/llm/matterhorn/ArtifactDependency
/*     */     //   92: astore #7
/*     */     //   94: iconst_0
/*     */     //   95: istore #8
/*     */     //   97: aload_2
/*     */     //   98: invokevirtual getChildren : ()Ljava/util/ArrayList;
/*     */     //   101: checkcast java/lang/Iterable
/*     */     //   104: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   107: checkcast java/lang/Iterable
/*     */     //   110: astore #9
/*     */     //   112: iconst_0
/*     */     //   113: istore #10
/*     */     //   115: aload #9
/*     */     //   117: instanceof java/util/Collection
/*     */     //   120: ifeq -> 140
/*     */     //   123: aload #9
/*     */     //   125: checkcast java/util/Collection
/*     */     //   128: invokeinterface isEmpty : ()Z
/*     */     //   133: ifeq -> 140
/*     */     //   136: iconst_1
/*     */     //   137: goto -> 219
/*     */     //   140: aload #9
/*     */     //   142: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   147: astore #11
/*     */     //   149: aload #11
/*     */     //   151: invokeinterface hasNext : ()Z
/*     */     //   156: ifeq -> 218
/*     */     //   159: aload #11
/*     */     //   161: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   166: astore #12
/*     */     //   168: aload #12
/*     */     //   170: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode
/*     */     //   173: astore #13
/*     */     //   175: iconst_0
/*     */     //   176: istore #14
/*     */     //   178: aload #13
/*     */     //   180: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   183: dup
/*     */     //   184: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.Artifactual'
/*     */     //   187: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   190: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   195: aload #7
/*     */     //   197: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   200: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   203: ifne -> 210
/*     */     //   206: iconst_1
/*     */     //   207: goto -> 211
/*     */     //   210: iconst_0
/*     */     //   211: ifne -> 149
/*     */     //   214: iconst_0
/*     */     //   215: goto -> 219
/*     */     //   218: iconst_1
/*     */     //   219: ifeq -> 408
/*     */     //   222: aload_0
/*     */     //   223: getfield unfinishedNodes : Ljava/util/Map;
/*     */     //   226: aload #7
/*     */     //   228: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   231: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   236: ifnonnull -> 243
/*     */     //   239: iconst_1
/*     */     //   240: goto -> 244
/*     */     //   243: iconst_0
/*     */     //   244: istore #9
/*     */     //   246: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   249: ifeq -> 271
/*     */     //   252: iload #9
/*     */     //   254: ifne -> 271
/*     */     //   257: ldc 'Assertion failed'
/*     */     //   259: astore #10
/*     */     //   261: new java/lang/AssertionError
/*     */     //   264: dup
/*     */     //   265: aload #10
/*     */     //   267: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   270: athrow
/*     */     //   271: aload_0
/*     */     //   272: getfield context : Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   275: aload #7
/*     */     //   277: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   280: invokevirtual lookupArtifactInCaches : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   283: astore #9
/*     */     //   285: aload #9
/*     */     //   287: ifnonnull -> 315
/*     */     //   290: aconst_null
/*     */     //   291: new com/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder$onUnfinishedArtifactUpdatedInternal$1$2
/*     */     //   294: dup
/*     */     //   295: aload_0
/*     */     //   296: aload #7
/*     */     //   298: aconst_null
/*     */     //   299: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;Lkotlin/coroutines/Continuation;)V
/*     */     //   302: checkcast kotlin/jvm/functions/Function2
/*     */     //   305: iconst_1
/*     */     //   306: aconst_null
/*     */     //   307: invokestatic runBlocking$default : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   310: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   313: astore #9
/*     */     //   315: aload #9
/*     */     //   317: ifnull -> 393
/*     */     //   320: aload_0
/*     */     //   321: aload #9
/*     */     //   323: aload_1
/*     */     //   324: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   329: invokespecial onUnfinishedArtifactCreatedInternal : (Lcom/intellij/ml/llm/matterhorn/Artifactual;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)V
/*     */     //   332: aload_0
/*     */     //   333: getfield finishedNodes : Ljava/util/Map;
/*     */     //   336: aload #7
/*     */     //   338: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   341: invokeinterface containsKey : (Ljava/lang/Object;)Z
/*     */     //   346: ifeq -> 381
/*     */     //   349: aload_0
/*     */     //   350: getfield unfinishedNodes : Ljava/util/Map;
/*     */     //   353: aload #7
/*     */     //   355: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   358: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   363: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode
/*     */     //   366: dup
/*     */     //   367: ifnull -> 377
/*     */     //   370: iconst_1
/*     */     //   371: invokevirtual setReference : (Z)V
/*     */     //   374: goto -> 387
/*     */     //   377: pop
/*     */     //   378: goto -> 387
/*     */     //   381: aload_0
/*     */     //   382: aload #9
/*     */     //   384: invokespecial onUnfinishedArtifactUpdatedInternal : (Lcom/intellij/ml/llm/matterhorn/Artifactual;)V
/*     */     //   387: aload_0
/*     */     //   388: aload #9
/*     */     //   390: invokespecial onArtifactFinishedInternal : (Lcom/intellij/ml/llm/matterhorn/Artifactual;)V
/*     */     //   393: aload_0
/*     */     //   394: getfield loadedNodes : Ljava/util/Set;
/*     */     //   397: aload #7
/*     */     //   399: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   402: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   407: pop
/*     */     //   408: nop
/*     */     //   409: nop
/*     */     //   410: goto -> 68
/*     */     //   413: nop
/*     */     //   414: aload_0
/*     */     //   415: getfield model : Lcom/intellij/ui/tree/StructureTreeModel;
/*     */     //   418: aload_2
/*     */     //   419: iconst_1
/*     */     //   420: invokevirtual invalidateAsync : (Ljava/lang/Object;Z)Ljava/util/concurrent/CompletableFuture;
/*     */     //   423: pop
/*     */     //   424: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #105	-> 0
/*     */     //   #106	-> 18
/*     */     //   #108	-> 19
/*     */     //   #109	-> 42
/*     */     //   #111	-> 47
/*     */     //   #202	-> 60
/*     */     //   #112	-> 97
/*     */     //   #203	-> 115
/*     */     //   #204	-> 140
/*     */     //   #112	-> 178
/*     */     //   #204	-> 211
/*     */     //   #205	-> 218
/*     */     //   #112	-> 219
/*     */     //   #113	-> 222
/*     */     //   #115	-> 271
/*     */     //   #116	-> 285
/*     */     //   #117	-> 290
/*     */     //   #119	-> 315
/*     */     //   #120	-> 320
/*     */     //   #121	-> 332
/*     */     //   #121	-> 346
/*     */     //   #122	-> 349
/*     */     //   #125	-> 381
/*     */     //   #127	-> 387
/*     */     //   #130	-> 393
/*     */     //   #132	-> 408
/*     */     //   #202	-> 409
/*     */     //   #206	-> 413
/*     */     //   #134	-> 414
/*     */     //   #135	-> 424
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   178	33	14	$i$a$-all-ArtifactTreeStructureBuilder$onUnfinishedArtifactUpdatedInternal$1$1	I
/*     */     //   175	36	13	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   168	50	12	element$iv	Ljava/lang/Object;
/*     */     //   115	104	10	$i$f$all	I
/*     */     //   112	107	9	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   285	122	9	cachedChild	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   97	312	8	$i$a$-forEach-ArtifactTreeStructureBuilder$onUnfinishedArtifactUpdatedInternal$1	I
/*     */     //   94	315	7	dependencyArtifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;
/*     */     //   87	323	6	element$iv	Ljava/lang/Object;
/*     */     //   60	354	4	$i$f$forEach	I
/*     */     //   57	357	3	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   42	383	2	node	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   0	425	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;
/*     */     //   0	425	1	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */   }
/*     */   @DebugMetadata(f = "ArtifactTreeStructureBuilder.kt", l = {117}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ArtifactTreeStructureBuilder$onUnfinishedArtifactUpdatedInternal$1$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ArtifactTreeStructureBuilder$onUnfinishedArtifactUpdatedInternal$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Artifactual>, Object> { int label;
/*     */     
/*     */     ArtifactTreeStructureBuilder$onUnfinishedArtifactUpdatedInternal$1$2(ArtifactDependency $dependencyArtifactId, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/* 117 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (ArtifactTreeStructureBuilder.this.getContext().lookupArtifact(this.$dependencyArtifactId.getArtifact(), (Continuation)this) == object) ? object : ArtifactTreeStructureBuilder.this.getContext().lookupArtifact(this.$dependencyArtifactId.getArtifact(), (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ArtifactTreeStructureBuilder$onUnfinishedArtifactUpdatedInternal$1$2> $completion) {
/*     */       return (Continuation<Unit>)new ArtifactTreeStructureBuilder$onUnfinishedArtifactUpdatedInternal$1$2(this.$dependencyArtifactId, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ArtifactTreeStructureBuilder$onUnfinishedArtifactUpdatedInternal$1$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void onArtifactFinishedInternal(Artifactual artifact) {
/* 138 */     if (this.loadedNodes.contains(artifact.getId())) {
/*     */       return;
/*     */     }
/* 141 */     Intrinsics.checkNotNull(this.unfinishedNodes.remove(artifact.getId())); ArtifactNode node = this.unfinishedNodes.remove(artifact.getId());
/* 142 */     node.setArtifact(artifact);
/*     */     
/* 144 */     this.finishedNodes.put(artifact.getId(), node);
/*     */     
/* 146 */     ArtifactStatistic statistics = this.context.calculateTotalStatistics(artifact, true);
/*     */     
/* 148 */     ArtifactNode currentNode = resolveArtifactNode(artifact.getId());
/* 149 */     currentNode.setStatistics(statistics);
/* 150 */     if (artifact instanceof FailedArtifact) {
/* 151 */       currentNode.setFailed(true);
/*     */     }
/* 153 */     this.model.invalidateAsync(currentNode, true);
/*     */   }
/*     */   
/*     */   private final void onCancellationInternal() {
/* 157 */     Iterable<ArtifactNode> $this$forEach$iv = this.unfinishedNodes.values(); int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 207 */     Iterator<ArtifactNode> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ArtifactNode node = (ArtifactNode)element$iv; int $i$a$-forEach-ArtifactTreeStructureBuilder$onCancellationInternal$1 = 0;
/*     */       ArtifactNode cancelledNode = node.getParent(); }
/*     */     
/*     */     this.model.invalidateAsync();
/*     */   }
/*     */   
/*     */   private final void onExceptionInternal(ArtifactId<?> artifactId, Exception e) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial resolveArtifactNode : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   5: astore_3
/*     */     //   6: new com/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode
/*     */     //   9: dup
/*     */     //   10: aload_0
/*     */     //   11: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   14: aload_3
/*     */     //   15: aconst_null
/*     */     //   16: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;Lcom/intellij/ml/llm/matterhorn/Artifactual;)V
/*     */     //   19: astore #4
/*     */     //   21: aload #4
/*     */     //   23: invokevirtual getOverriddenPresentation : ()Lcom/intellij/ide/projectView/PresentationData;
/*     */     //   26: astore #5
/*     */     //   28: aload_2
/*     */     //   29: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   32: dup
/*     */     //   33: ifnull -> 49
/*     */     //   36: astore #9
/*     */     //   38: iconst_0
/*     */     //   39: istore #10
/*     */     //   41: aload #9
/*     */     //   43: invokestatic wordsToBeginFromUpperCase : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   46: goto -> 51
/*     */     //   49: pop
/*     */     //   50: aconst_null
/*     */     //   51: astore #6
/*     */     //   53: aload_2
/*     */     //   54: invokevirtual getStackTrace : ()[Ljava/lang/StackTraceElement;
/*     */     //   57: dup
/*     */     //   58: ldc_w 'getStackTrace(...)'
/*     */     //   61: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   64: checkcast [Ljava/lang/Object;
/*     */     //   67: astore #9
/*     */     //   69: iconst_0
/*     */     //   70: istore #10
/*     */     //   72: aload #9
/*     */     //   74: arraylength
/*     */     //   75: istore #11
/*     */     //   77: iload #10
/*     */     //   79: iload #11
/*     */     //   81: if_icmpge -> 136
/*     */     //   84: aload #9
/*     */     //   86: iload #10
/*     */     //   88: aaload
/*     */     //   89: astore #12
/*     */     //   91: aload #12
/*     */     //   93: checkcast java/lang/StackTraceElement
/*     */     //   96: astore #13
/*     */     //   98: iconst_0
/*     */     //   99: istore #14
/*     */     //   101: aload #13
/*     */     //   103: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   106: dup
/*     */     //   107: ldc_w 'toString(...)'
/*     */     //   110: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   113: ldc_w 'com.intellij.ml.llm.matterhorn'
/*     */     //   116: iconst_0
/*     */     //   117: iconst_2
/*     */     //   118: aconst_null
/*     */     //   119: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   122: ifeq -> 130
/*     */     //   125: aload #12
/*     */     //   127: goto -> 137
/*     */     //   130: iinc #10, 1
/*     */     //   133: goto -> 77
/*     */     //   136: aconst_null
/*     */     //   137: checkcast java/lang/StackTraceElement
/*     */     //   140: astore #7
/*     */     //   142: aload #7
/*     */     //   144: dup
/*     */     //   145: ifnull -> 181
/*     */     //   148: astore #10
/*     */     //   150: iconst_0
/*     */     //   151: istore #11
/*     */     //   153: aload #7
/*     */     //   155: invokevirtual getClassName : ()Ljava/lang/String;
/*     */     //   158: aload #7
/*     */     //   160: invokevirtual getMethodName : ()Ljava/lang/String;
/*     */     //   163: aload #7
/*     */     //   165: invokevirtual getFileName : ()Ljava/lang/String;
/*     */     //   168: aload #7
/*     */     //   170: invokevirtual getLineNumber : ()I
/*     */     //   173: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   178: goto -> 183
/*     */     //   181: pop
/*     */     //   182: aconst_null
/*     */     //   183: astore #8
/*     */     //   185: aload #5
/*     */     //   187: ldc_w '[FAIL] '
/*     */     //   190: getstatic com/intellij/ui/SimpleTextAttributes.REGULAR_BOLD_ATTRIBUTES : Lcom/intellij/ui/SimpleTextAttributes;
/*     */     //   193: invokevirtual addText : (Ljava/lang/String;Lcom/intellij/ui/SimpleTextAttributes;)V
/*     */     //   196: aload #5
/*     */     //   198: aload #6
/*     */     //   200: getstatic com/intellij/ui/SimpleTextAttributes.REGULAR_ATTRIBUTES : Lcom/intellij/ui/SimpleTextAttributes;
/*     */     //   203: invokevirtual addText : (Ljava/lang/String;Lcom/intellij/ui/SimpleTextAttributes;)V
/*     */     //   206: aload #5
/*     */     //   208: ldc_w ' - '
/*     */     //   211: getstatic com/intellij/ui/SimpleTextAttributes.REGULAR_ATTRIBUTES : Lcom/intellij/ui/SimpleTextAttributes;
/*     */     //   214: invokevirtual addText : (Ljava/lang/String;Lcom/intellij/ui/SimpleTextAttributes;)V
/*     */     //   217: aload #5
/*     */     //   219: aload #8
/*     */     //   221: getstatic com/intellij/ui/SimpleTextAttributes.ERROR_ATTRIBUTES : Lcom/intellij/ui/SimpleTextAttributes;
/*     */     //   224: invokevirtual addText : (Ljava/lang/String;Lcom/intellij/ui/SimpleTextAttributes;)V
/*     */     //   227: aload #5
/*     */     //   229: getstatic com/intellij/icons/AllIcons$RunConfigurations.TestError : Ljavax/swing/Icon;
/*     */     //   232: invokevirtual setIcon : (Ljavax/swing/Icon;)V
/*     */     //   235: aload_3
/*     */     //   236: aload #4
/*     */     //   238: invokevirtual add : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;)V
/*     */     //   241: aload_3
/*     */     //   242: astore #9
/*     */     //   244: aload #9
/*     */     //   246: ifnull -> 265
/*     */     //   249: aload #9
/*     */     //   251: iconst_1
/*     */     //   252: invokevirtual setFailed : (Z)V
/*     */     //   255: aload #9
/*     */     //   257: invokevirtual getParent : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   260: astore #9
/*     */     //   262: goto -> 244
/*     */     //   265: aload_0
/*     */     //   266: getfield unfinishedNodes : Ljava/util/Map;
/*     */     //   269: invokeinterface values : ()Ljava/util/Collection;
/*     */     //   274: checkcast java/lang/Iterable
/*     */     //   277: astore #10
/*     */     //   279: iconst_0
/*     */     //   280: istore #11
/*     */     //   282: aload #10
/*     */     //   284: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   289: astore #12
/*     */     //   291: aload #12
/*     */     //   293: invokeinterface hasNext : ()Z
/*     */     //   298: ifeq -> 331
/*     */     //   301: aload #12
/*     */     //   303: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   308: astore #13
/*     */     //   310: aload #13
/*     */     //   312: checkcast com/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode
/*     */     //   315: astore #14
/*     */     //   317: iconst_0
/*     */     //   318: istore #15
/*     */     //   320: aload #14
/*     */     //   322: iconst_1
/*     */     //   323: invokevirtual setCancelled : (Z)V
/*     */     //   326: nop
/*     */     //   327: nop
/*     */     //   328: goto -> 291
/*     */     //   331: nop
/*     */     //   332: aload_0
/*     */     //   333: getfield model : Lcom/intellij/ui/tree/StructureTreeModel;
/*     */     //   336: invokevirtual invalidateAsync : ()Ljava/util/concurrent/CompletableFuture;
/*     */     //   339: pop
/*     */     //   340: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #170	-> 0
/*     */     //   #171	-> 6
/*     */     //   #172	-> 21
/*     */     //   #174	-> 28
/*     */     //   #209	-> 38
/*     */     //   #174	-> 41
/*     */     //   #174	-> 46
/*     */     //   #174	-> 49
/*     */     //   #175	-> 53
/*     */     //   #209	-> 98
/*     */     //   #175	-> 101
/*     */     //   #175	-> 122
/*     */     //   #175	-> 137
/*     */     //   #176	-> 142
/*     */     //   #209	-> 150
/*     */     //   #176	-> 153
/*     */     //   #176	-> 178
/*     */     //   #176	-> 181
/*     */     //   #178	-> 185
/*     */     //   #179	-> 196
/*     */     //   #181	-> 206
/*     */     //   #182	-> 217
/*     */     //   #184	-> 227
/*     */     //   #186	-> 235
/*     */     //   #188	-> 241
/*     */     //   #189	-> 244
/*     */     //   #190	-> 249
/*     */     //   #191	-> 255
/*     */     //   #195	-> 265
/*     */     //   #210	-> 282
/*     */     //   #196	-> 320
/*     */     //   #197	-> 326
/*     */     //   #210	-> 327
/*     */     //   #211	-> 331
/*     */     //   #199	-> 332
/*     */     //   #200	-> 340
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   41	5	10	$i$a$-let-ArtifactTreeStructureBuilder$onExceptionInternal$reason$1	I
/*     */     //   38	8	9	it	Ljava/lang/String;
/*     */     //   101	21	14	$i$a$-find-ArtifactTreeStructureBuilder$onExceptionInternal$place$1	I
/*     */     //   98	24	13	it	Ljava/lang/StackTraceElement;
/*     */     //   153	25	11	$i$a$-let-ArtifactTreeStructureBuilder$onExceptionInternal$placeText$1	I
/*     */     //   150	28	10	it	Ljava/lang/StackTraceElement;
/*     */     //   320	7	15	$i$a$-forEach-ArtifactTreeStructureBuilder$onExceptionInternal$1	I
/*     */     //   317	10	14	node	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   310	18	13	element$iv	Ljava/lang/Object;
/*     */     //   282	50	11	$i$f$forEach	I
/*     */     //   279	53	10	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   6	335	3	currentNode	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   21	320	4	child	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   28	313	5	data	Lcom/intellij/ide/projectView/PresentationData;
/*     */     //   53	288	6	reason	Ljava/lang/String;
/*     */     //   142	199	7	place	Ljava/lang/StackTraceElement;
/*     */     //   185	156	8	placeText	Ljava/lang/String;
/*     */     //   244	97	9	failedNode	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*     */     //   0	341	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactTreeStructureBuilder;
/*     */     //   0	341	1	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   0	341	2	e	Ljava/lang/Exception;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ArtifactTreeStructureBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */