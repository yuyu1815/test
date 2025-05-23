/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\004\n\002\020\021\n\002\b\002\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\n\032\0020\013H\026J\b\020\f\032\0020\rH\026J\"\020\016\032\006\022\002\b\0030\0172\006\020\020\032\0020\0212\f\020\022\032\b\022\002\b\003\030\0010\017H\026J\b\020\023\032\0020\tH\026J\022\020\024\032\004\030\0010\t2\006\020\020\032\0020\021H\026J\033\020\025\032\b\022\004\022\0020\0210\0262\006\020\020\032\0020\021H\026¢\006\002\020\027R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\016\020\b\032\0020\tX\004¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactsTreeStructure;", "Lcom/intellij/ide/util/treeView/AbstractTreeStructure;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "root", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;", "commit", "", "hasSomethingToCommit", "", "createDescriptor", "Lcom/intellij/ide/util/treeView/NodeDescriptor;", "element", "", "parent", "getRootElement", "getParentElement", "getChildElements", "", "(Ljava/lang/Object;)[Ljava/lang/Object;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nArtifactsTreeStructure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArtifactsTreeStructure.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ArtifactsTreeStructure\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,25:1\n1#2:26\n37#3,2:27\n*S KotlinDebug\n*F\n+ 1 ArtifactsTreeStructure.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ArtifactsTreeStructure\n*L\n23#1:27,2\n*E\n"})
/*    */ public final class ArtifactsTreeStructure extends AbstractTreeStructure { @NotNull
/*    */   private final Project project;
/*  7 */   public ArtifactsTreeStructure(@NotNull Project project) { this.project = project;
/*  8 */     this.root = new ArtifactNode(this.project, null, null); }
/*    */   @NotNull
/*    */   private final ArtifactNode root; public static final int $stable = 8; @NotNull
/*    */   public final Project getProject() { return this.project; } public void commit() {} public boolean hasSomethingToCommit() {
/* 12 */     return false; }
/*    */   @NotNull
/* 14 */   public NodeDescriptor<?> createDescriptor(@NotNull Object element, @Nullable NodeDescriptor parent) { Intrinsics.checkNotNullParameter(element, "element"); return (NodeDescriptor)element; }
/*    */   @NotNull
/* 16 */   public ArtifactNode getRootElement() { return this.root; } @Nullable
/*    */   public ArtifactNode getParentElement(@NotNull Object element) {
/* 18 */     Intrinsics.checkNotNullParameter(element, "element"); return ((ArtifactNode)element).getParent();
/*    */   } @NotNull
/*    */   public Object[] getChildElements(@NotNull Object element) {
/* 21 */     Intrinsics.checkNotNullParameter(element, "element"); ArtifactNode node = (element instanceof ArtifactNode) ? (ArtifactNode)element : null;
/* 22 */     if (node != null && node.getChildren() != null) { ArrayList<ArtifactNode> arrayList = node.getChildren();
/*    */ 
/*    */ 
/*    */       
/* 26 */       int $i$a$-ifEmpty-ArtifactsTreeStructure$getChildElements$children$1 = 0; if ((arrayList.isEmpty() ? null : arrayList) != null) {
/* 27 */         Object object; Collection $this$toTypedArray$iv = (Collection)object; int $i$f$toTypedArray = 0; Collection thisCollection$iv = $this$toTypedArray$iv;
/* 28 */         return thisCollection$iv.toArray(new Object[0]);
/*    */       }  }
/*    */     
/*    */     node.getChildren();
/*    */     return new Object[0];
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ArtifactsTreeStructure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */