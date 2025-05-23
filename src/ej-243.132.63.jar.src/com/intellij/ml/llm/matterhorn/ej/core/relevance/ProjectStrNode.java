/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\002\n\002\020!\n\002\b\f\n\002\020\002\n\002\b\002\n\002\020 \n\002\b\004\n\002\020\b\n\002\b\004\030\000  2\0020\001:\001 B3\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\000\022\016\b\002\020\007\032\b\022\004\022\0020\0000\b¢\006\004\b\t\020\nJ\016\020\022\032\0020\0032\006\020\023\032\0020\003J\016\020\024\032\0020\0252\006\020\026\032\0020\000J\f\020\027\032\b\022\004\022\0020\0000\030J\f\020\031\032\b\022\004\022\0020\0000\030J\f\020\032\032\b\022\004\022\0020\0000\030J&\020\033\032\b\022\004\022\0020\0000\0302\006\020\034\032\0020\0352\006\020\023\032\0020\0032\b\b\002\020\036\032\0020\035J\f\020\037\032\b\022\004\022\0020\0000\030R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\004\020\rR\023\020\006\032\004\030\0010\000¢\006\b\n\000\032\004\b\016\020\017R\027\020\007\032\b\022\004\022\0020\0000\b¢\006\b\n\000\032\004\b\020\020\021¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;", "", "name", "", "isDir", "", "parent", "children", "", "<init>", "(Ljava/lang/String;ZLcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "()Z", "getParent", "()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;", "getChildren", "()Ljava/util/List;", "getFullPath", "useSlash", "addChild", "", "child", "getAllNodes", "", "getAllDirNodes", "getAllFilesNodes", "getDirNodesUpToDepth", "maxDepth", "", "currentDepth", "getTopLevelFilesNodes", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nProjectStrWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectStrWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1863#2,2:223\n1863#2,2:225\n1863#2,2:227\n1863#2,2:229\n774#2:231\n865#2,2:232\n1863#2:234\n774#2:235\n865#2,2:236\n1864#2:238\n774#2:239\n865#2,2:240\n1863#2,2:242\n774#2:244\n865#2,2:245\n*S KotlinDebug\n*F\n+ 1 ProjectStrWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode\n*L\n37#1:223,2\n46#1:225,2\n55#1:227,2\n68#1:229,2\n69#1:231\n69#1:232,2\n69#1:234\n71#1:235\n71#1:236,2\n69#1:238\n74#1:239\n74#1:240,2\n74#1:242,2\n82#1:244\n82#1:245,2\n*E\n"})
/*     */ public final class ProjectStrNode {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String name;
/*     */   private final boolean isDir;
/*     */   @Nullable
/*     */   private final ProjectStrNode parent;
/*     */   @NotNull
/*     */   private final List<ProjectStrNode> children;
/*     */   
/*  19 */   public ProjectStrNode(@NotNull String name, boolean isDir, @Nullable ProjectStrNode parent, @NotNull List<ProjectStrNode> children) { this.name = name;
/*  20 */     this.isDir = isDir;
/*  21 */     this.parent = parent;
/*  22 */     this.children = children; } @NotNull public final String getName() { return this.name; } public final boolean isDir() { return this.isDir; } @Nullable public final ProjectStrNode getParent() { return this.parent; } @NotNull public final List<ProjectStrNode> getChildren() { return this.children; }
/*     */   
/*     */   @NotNull
/*     */   public final String getFullPath(@NotNull String useSlash) {
/*  26 */     Intrinsics.checkNotNullParameter(useSlash, "useSlash"); if (this.parent == null || this.parent.getFullPath(useSlash) == null) this.parent.getFullPath(useSlash);  String parentPath = "";
/*  27 */     return ((((CharSequence)parentPath).length() > 0)) ? (parentPath + parentPath + useSlash) : this.name;
/*     */   }
/*     */   
/*     */   public final void addChild(@NotNull ProjectStrNode child) {
/*  31 */     Intrinsics.checkNotNullParameter(child, "child"); this.children.add(child);
/*     */   }
/*     */   
/*     */   @NotNull
/*  35 */   public final List<ProjectStrNode> getAllNodes() { List<ProjectStrNode> result = new ArrayList();
/*  36 */     result.add(this);
/*  37 */     Iterable<ProjectStrNode> $this$forEach$iv = this.children; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 223 */     Iterator<ProjectStrNode> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ProjectStrNode it = (ProjectStrNode)element$iv; int $i$a$-forEach-ProjectStrNode$getAllNodes$1 = 0; result.addAll(it.getAllNodes()); }
/*     */      return result; } @NotNull public final List<ProjectStrNode> getAllDirNodes() { List<ProjectStrNode> result = new ArrayList(); if (this.isDir && ((((CharSequence)this.name).length() > 0)))
/* 225 */       result.add(this);  Iterable<ProjectStrNode> $this$forEach$iv = this.children; int $i$f$forEach = 0; Iterator<ProjectStrNode> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ProjectStrNode it = (ProjectStrNode)element$iv; int $i$a$-forEach-ProjectStrNode$getAllDirNodes$1 = 0; result.addAll(it.getAllDirNodes()); }
/*     */      return result; } @NotNull public final List<ProjectStrNode> getAllFilesNodes() { List<ProjectStrNode> result = new ArrayList(); if (!this.isDir && ((((CharSequence)this.name).length() > 0)))
/* 227 */       result.add(this);  Iterable<ProjectStrNode> $this$forEach$iv = this.children; int $i$f$forEach = 0; Iterator<ProjectStrNode> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ProjectStrNode it = (ProjectStrNode)element$iv; int $i$a$-forEach-ProjectStrNode$getAllFilesNodes$1 = 0; result.addAll(it.getAllFilesNodes()); }
/*     */      return result; } @NotNull public final List<ProjectStrNode> getDirNodesUpToDepth(int maxDepth, @NotNull String useSlash, int currentDepth) { Iterator iterator1; Intrinsics.checkNotNullParameter(useSlash, "useSlash"); List<ProjectStrNode> result = new ArrayList(); if (this.isDir && ((((CharSequence)this.name).length() > 0)))
/* 229 */       result.add(this);  if (currentDepth < maxDepth) { if (currentDepth == 0) { Iterable<ProjectStrNode> $this$forEach$iv = this.children; int i = 0; iterator1 = $this$forEach$iv.iterator(); }
/*     */       else
/*     */       { Iterable<ProjectStrNode> iterable2 = this.children;
/*     */ 
/*     */ 
/*     */         
/*     */         int j = 0;
/*     */ 
/*     */ 
/*     */         
/* 239 */         Iterable<ProjectStrNode> $this$filterTo$iv$iv = iterable2; Collection<Object> collection = new ArrayList(); int k = 0;
/* 240 */         for (ProjectStrNode element$iv$iv : $this$filterTo$iv$iv) { ProjectStrNode it = element$iv$iv; int $i$a$-filter-ProjectStrNode$getDirNodesUpToDepth$4 = 0; if (it.isDir) collection.add(element$iv$iv);  }
/* 241 */          Iterable $this$forEach$iv = collection; int i = 0;
/* 242 */         iterator1 = $this$forEach$iv.iterator(); if (iterator1.hasNext()) { Object element$iv = iterator1.next(); ProjectStrNode dir = (ProjectStrNode)element$iv; int $i$a$-forEach-ProjectStrNode$getDirNodesUpToDepth$5 = 0; result.addAll(dir.getDirNodesUpToDepth(maxDepth, useSlash, currentDepth + 1)); }  }  } else { return result; }  if (iterator1.hasNext()) { Object element$iv = iterator1.next(); ProjectStrNode child = (ProjectStrNode)element$iv; int $i$a$-forEach-ProjectStrNode$getDirNodesUpToDepth$1 = 0; result.add(child); }  Iterable<ProjectStrNode> $this$filter$iv = this.children; int $i$f$filter = 0; Iterable<ProjectStrNode> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; for (ProjectStrNode element$iv$iv : iterable1) { ProjectStrNode it = element$iv$iv; int $i$a$-filter-ProjectStrNode$getDirNodesUpToDepth$2 = 0; if (it.isDir)
/*     */         destination$iv$iv.add(element$iv$iv);  }  $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0; Iterator<ProjectStrNode> iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ProjectStrNode dir = (ProjectStrNode)element$iv; boolean bool = false; List<ProjectStrNode> subDirs = dir.getDirNodesUpToDepth(maxDepth, useSlash, currentDepth + 1); List<ProjectStrNode> list1 = subDirs, list2 = result; int i = 0; List<ProjectStrNode> list3 = list1; Collection collection = new ArrayList(); int j = 0; Iterator<ProjectStrNode> iterator2 = list3.iterator(); }
/* 244 */      } @NotNull public final List<ProjectStrNode> getTopLevelFilesNodes() { Iterable<ProjectStrNode> $this$filter$iv = this.children; int $i$f$filter = 0; Iterable<ProjectStrNode> iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 245 */     for (ProjectStrNode element$iv$iv : iterable1) { ProjectStrNode it = element$iv$iv; int $i$a$-filter-ProjectStrNode$getTopLevelFilesNodes$1 = 0; if (!it.isDir) destination$iv$iv.add(element$iv$iv);  }
/* 246 */      return (List)destination$iv$iv; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\b\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020\004\032\0020\005*\b\022\004\022\0020\0070\0062\006\020\b\032\0020\0052\006\020\t\032\0020\0052\006\020\n\032\0020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode$Companion;", "", "<init>", "()V", "toStringWithDescription", "", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;", "description", "useSlash", "maxOnePathLen", "", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nProjectStrWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectStrWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n774#2:223\n865#2,2:224\n1557#2:226\n1628#2,3:227\n774#2:230\n865#2,2:231\n*S KotlinDebug\n*F\n+ 1 ProjectStrWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode$Companion\n*L\n87#1:223\n87#1:224,2\n88#1:226\n88#1:227,3\n89#1:230\n89#1:231,2\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final String toStringWithDescription(@NotNull List $this$toStringWithDescription, @NotNull String description, @NotNull String useSlash, int maxOnePathLen) {
/*     */       Intrinsics.checkNotNullParameter($this$toStringWithDescription, "<this>");
/*     */       Intrinsics.checkNotNullParameter(description, "description");
/*     */       Intrinsics.checkNotNullParameter(useSlash, "useSlash");
/*     */       Iterable $this$filter$iv = $this$toStringWithDescription;
/*     */       int i = 0;
/*     */       Iterable iterable1 = $this$filter$iv;
/*     */       Collection<Object> collection1 = new ArrayList();
/*     */       int j = 0;
/*     */       for (Object element$iv$iv : iterable1) {
/*     */         ProjectStrNode it = (ProjectStrNode)element$iv$iv;
/*     */         int $i$a$-filter-ProjectStrNode$Companion$toStringWithDescription$formatedPath$1 = 0;
/*     */         if ((((CharSequence)it.getName()).length() > 0))
/*     */           collection1.add(element$iv$iv); 
/*     */       } 
/*     */       $this$filter$iv = collection1;
/*     */       int $i$f$map = 0;
/*     */       Iterable $this$filterTo$iv$iv = $this$filter$iv;
/*     */       Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10));
/*     */       int $i$f$mapTo = 0;
/*     */       for (Object item$iv$iv : $this$filterTo$iv$iv) {
/*     */         ProjectStrNode projectStrNode = (ProjectStrNode)item$iv$iv;
/*     */         Collection<String> collection2 = collection;
/*     */         int $i$a$-map-ProjectStrNode$Companion$toStringWithDescription$formatedPath$2 = 0;
/*     */         collection2.add(projectStrNode.getFullPath(useSlash));
/*     */       } 
/*     */       Iterable $this$map$iv = collection;
/*     */       int $i$f$filter = 0;
/*     */       Iterable $this$mapTo$iv$iv = $this$map$iv;
/*     */       Collection<Object> destination$iv$iv = new ArrayList();
/*     */       int $i$f$filterTo = 0;
/*     */       for (Object element$iv$iv : $this$mapTo$iv$iv) {
/*     */         String it = (String)element$iv$iv;
/*     */         int $i$a$-filter-ProjectStrNode$Companion$toStringWithDescription$formatedPath$3 = 0;
/*     */         if ((it.length() <= maxOnePathLen))
/*     */           destination$iv$iv.add(element$iv$iv); 
/*     */       } 
/*     */       String formatedPath = CollectionsKt.joinToString$default(CollectionsKt.sorted(CollectionsKt.distinct(destination$iv$iv)), "\n", null, null, 0, null, null, 62, null);
/*     */       return ((((CharSequence)formatedPath).length() > 0)) ? (description + "\n\n" + description) : "";
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\ProjectStrNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */