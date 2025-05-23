/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\b\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\002\b\013\b\007\030\0002\b\022\004\022\0020\0000\0012\0020\002B#\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\000\022\b\020\006\032\004\030\0010\007¢\006\004\b\b\020\tJ\020\020%\032\0020&2\006\020'\032\0020 H\024J\b\020(\032\0020\000H\026J\016\020)\032\0020&2\006\020*\032\0020\000J\006\020+\032\0020&J\f\020,\032\b\022\004\022\0020\0000$J\020\020-\032\0020&2\006\020.\032\0020\021H\026J\b\020/\032\0020\021H\026J\b\0200\032\0020\021H\026R\023\020\005\032\004\030\0010\000¢\006\b\n\000\032\004\b\n\020\013R\034\020\006\032\004\030\0010\007X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R\032\020\020\032\0020\021X\016¢\006\016\n\000\032\004\b\020\020\022\"\004\b\023\020\024R\032\020\025\032\0020\021X\016¢\006\016\n\000\032\004\b\025\020\022\"\004\b\026\020\024R\032\020\027\032\0020\021X\016¢\006\016\n\000\032\004\b\027\020\022\"\004\b\030\020\024R\034\020\031\032\004\030\0010\032X\016¢\006\016\n\000\032\004\b\033\020\034\"\004\b\035\020\036R\021\020\037\032\0020 ¢\006\b\n\000\032\004\b!\020\"R\024\020#\032\b\022\004\022\0020\0000$X\004¢\006\002\n\000¨\0061"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;", "Lcom/intellij/ide/util/treeView/PresentableNodeDescriptor;", "Lcom/intellij/pom/Navigatable;", "project", "Lcom/intellij/openapi/project/Project;", "parent", "artifact", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;Lcom/intellij/ml/llm/matterhorn/Artifactual;)V", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;", "getArtifact", "()Lcom/intellij/ml/llm/matterhorn/Artifactual;", "setArtifact", "(Lcom/intellij/ml/llm/matterhorn/Artifactual;)V", "isCancelled", "", "()Z", "setCancelled", "(Z)V", "isFailed", "setFailed", "isReference", "setReference", "statistics", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "getStatistics", "()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "setStatistics", "(Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;)V", "overriddenPresentation", "Lcom/intellij/ide/projectView/PresentationData;", "getOverriddenPresentation", "()Lcom/intellij/ide/projectView/PresentationData;", "children", "Ljava/util/ArrayList;", "update", "", "presentation", "getElement", "add", "node", "removeChildren", "getChildren", "navigate", "requestFocus", "canNavigate", "canNavigateToSource", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class ArtifactNode extends PresentableNodeDescriptor<ArtifactNode> implements Navigatable { @Nullable
/*    */   private final ArtifactNode parent; @Nullable
/*    */   private Artifactual artifact; private boolean isCancelled; private boolean isFailed; private boolean isReference;
/*    */   @Nullable
/*    */   private ArtifactStatistic statistics;
/*    */   @NotNull
/*    */   private final PresentationData overriddenPresentation;
/*    */   @NotNull
/*    */   private final ArrayList<ArtifactNode> children;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @Nullable
/* 15 */   public final ArtifactNode getParent() { return this.parent; } @Nullable public final Artifactual getArtifact() { return this.artifact; } public final void setArtifact(@Nullable Artifactual <set-?>) { this.artifact = <set-?>; }
/* 16 */   public ArtifactNode(@NotNull Project project, @Nullable ArtifactNode parent, @Nullable Artifactual artifact) { super(project, (NodeDescriptor)parent);
/*    */ 
/*    */     
/*    */     this.parent = parent;
/*    */     
/*    */     this.artifact = artifact;
/*    */     
/* 23 */     this.overriddenPresentation = new PresentationData();
/*    */     
/* 25 */     this.children = new ArrayList<>(); }
/*    */   public final boolean isCancelled() { return this.isCancelled; }
/*    */   public final void setCancelled(boolean <set-?>) { this.isCancelled = <set-?>; }
/* 28 */   public final boolean isFailed() { return this.isFailed; } public final void setFailed(boolean <set-?>) { this.isFailed = <set-?>; } protected void update(@NotNull PresentationData presentation) { Intrinsics.checkNotNullParameter(presentation, "presentation"); presentation.setPresentableText((this.artifact != null) ? this.artifact.getTitle() : null); }
/*    */   public final boolean isReference() { return this.isReference; }
/*    */   public final void setReference(boolean <set-?>) { this.isReference = <set-?>; }
/*    */   @Nullable public final ArtifactStatistic getStatistics() { return this.statistics; }
/* 32 */   public final void setStatistics(@Nullable ArtifactStatistic <set-?>) { this.statistics = <set-?>; } @NotNull public final PresentationData getOverriddenPresentation() { return this.overriddenPresentation; } @NotNull public ArtifactNode getElement() { return this; }
/*    */ 
/*    */   
/*    */   public final void add(@NotNull ArtifactNode node) {
/* 36 */     Intrinsics.checkNotNullParameter(node, "node"); this.children.add(node);
/*    */   }
/*    */   
/*    */   public final void removeChildren() {
/* 40 */     this.children.clear();
/*    */   }
/*    */   @NotNull
/*    */   public final ArrayList<ArtifactNode> getChildren() {
/* 44 */     return this.children;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void navigate(boolean requestFocus) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield artifact : Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*    */     //   4: dup
/*    */     //   5: ifnull -> 16
/*    */     //   8: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*    */     //   13: goto -> 18
/*    */     //   16: pop
/*    */     //   17: aconst_null
/*    */     //   18: dup
/*    */     //   19: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   22: astore_2
/*    */     //   23: new com/intellij/ml/llm/matterhorn/FileMatterhornCaches
/*    */     //   26: dup
/*    */     //   27: aload_0
/*    */     //   28: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   31: dup
/*    */     //   32: ldc 'getProject(...)'
/*    */     //   34: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   37: invokespecial <init> : (Lcom/intellij/openapi/project/Project;)V
/*    */     //   40: invokevirtual getLogs : ()Ljava/nio/file/Path;
/*    */     //   43: astore_3
/*    */     //   44: aload_3
/*    */     //   45: aload_2
/*    */     //   46: invokevirtual toFileName : ()Ljava/lang/String;
/*    */     //   49: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   54: invokeinterface resolve : (Ljava/lang/String;)Ljava/nio/file/Path;
/*    */     //   59: astore #4
/*    */     //   61: aload #4
/*    */     //   63: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   66: aload #4
/*    */     //   68: iconst_0
/*    */     //   69: anewarray java/nio/file/LinkOption
/*    */     //   72: dup
/*    */     //   73: arraylength
/*    */     //   74: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*    */     //   77: checkcast [Ljava/nio/file/LinkOption;
/*    */     //   80: invokestatic isRegularFile : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
/*    */     //   83: ifeq -> 114
/*    */     //   86: aload #4
/*    */     //   88: invokestatic refreshAndFindVirtualFileOrDirectory : (Ljava/nio/file/Path;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   91: astore #5
/*    */     //   93: aload #5
/*    */     //   95: ifnull -> 114
/*    */     //   98: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*    */     //   101: aload_0
/*    */     //   102: aload #5
/*    */     //   104: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/Runnable;
/*    */     //   109: invokeinterface invokeLater : (Ljava/lang/Runnable;)V
/*    */     //   114: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 0
/*    */     //   #49	-> 23
/*    */     //   #50	-> 44
/*    */     //   #51	-> 61
/*    */     //   #51	-> 83
/*    */     //   #52	-> 86
/*    */     //   #53	-> 93
/*    */     //   #54	-> 98
/*    */     //   #59	-> 114
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	21	5	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   23	92	2	relativePath	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*    */     //   44	71	3	logs	Ljava/nio/file/Path;
/*    */     //   61	54	4	artifactFile	Ljava/nio/file/Path;
/*    */     //   0	115	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;
/*    */     //   0	115	1	requestFocus	Z
/*    */   }
/*    */ 
/*    */   
/*    */   private static final void navigate$lambda$0(ArtifactNode this$0, VirtualFile $virtualFile) {
/* 55 */     FileEditorManager.getInstance(this$0.getProject()).openFile($virtualFile, true);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean canNavigate() {
/* 62 */     return (((this.artifact != null) ? this.artifact.getId() : null) != null);
/*    */   }
/*    */   
/*    */   public boolean canNavigateToSource() {
/* 66 */     return canNavigate();
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ArtifactNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */