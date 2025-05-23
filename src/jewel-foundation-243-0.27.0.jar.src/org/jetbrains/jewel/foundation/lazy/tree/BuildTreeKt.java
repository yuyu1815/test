/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000J\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\0321\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\035\020\003\032\031\022\n\022\b\022\004\022\002H\0020\005\022\004\022\0020\0060\004¢\006\002\b\007\0326\020\b\032\016\022\n\022\b\022\004\022\002H\0020\n0\t\"\004\b\000\020\0022\f\020\013\032\b\022\004\022\002H\0020\f2\f\020\r\032\b\022\004\022\002H\0020\016H\002\032\"\020\017\032\b\022\004\022\002H\0020\n\"\004\b\000\020\0022\f\020\020\032\b\022\004\022\002H\0020\nH\002\032&\020\021\032\b\022\004\022\0020\0220\001*\0020\0232\024\b\002\020\024\032\016\022\004\022\0020\022\022\004\022\0020\0250\004\032&\020\021\032\b\022\004\022\0020\0220\001*\0020\0222\024\b\002\020\024\032\016\022\004\022\0020\022\022\004\022\0020\0250\004\032&\020\026\032\0020\006*\b\022\004\022\0020\0220\0272\022\020\024\032\016\022\004\022\0020\022\022\004\022\0020\0250\004H\002¨\006\030"}, d2 = {"buildTree", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;", "T", "builder", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder;", "", "Lkotlin/ExtensionFunctionType;", "generateElements", "", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "parent", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;", "parentElementBuilder", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node;", "evaluatePrevious", "element", "asTree", "Ljava/io/File;", "Ljava/nio/file/Path;", "isOpen", "", "generateFileNodes", "Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope;", "foundation"})
/*     */ @SourceDebugExtension({"SMAP\nBuildTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuildTree.kt\norg/jetbrains/jewel/foundation/lazy/tree/BuildTreeKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,173:1\n6442#2:174\n1855#3,2:175\n*S KotlinDebug\n*F\n+ 1 BuildTree.kt\norg/jetbrains/jewel/foundation/lazy/tree/BuildTreeKt\n*L\n165#1:174\n166#1:175,2\n*E\n"})
/*     */ public final class BuildTreeKt {
/*     */   @NotNull
/*     */   public static final <T> Tree<T> buildTree(@NotNull Function1 builder) {
/*   7 */     Intrinsics.checkNotNullParameter(builder, "builder"); TreeBuilder<T> treeBuilder = new TreeBuilder(); builder.invoke(treeBuilder); return treeBuilder.build();
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
/*     */   private static final <T> List<Tree.Element<T>> generateElements(Tree.Element.Node<?> parent, TreeBuilder.Element.Node<T> parentElementBuilder) {
/*     */     // Byte code:
/*     */     //   0: new org/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope
/*     */     //   3: dup
/*     */     //   4: aload_0
/*     */     //   5: invokespecial <init> : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;)V
/*     */     //   8: astore_2
/*     */     //   9: aload_1
/*     */     //   10: invokevirtual getChildrenGenerator : ()Lkotlin/jvm/functions/Function1;
/*     */     //   13: aload_2
/*     */     //   14: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   19: pop
/*     */     //   20: new java/util/ArrayList
/*     */     //   23: dup
/*     */     //   24: invokespecial <init> : ()V
/*     */     //   27: checkcast java/util/List
/*     */     //   30: astore_3
/*     */     //   31: iconst_0
/*     */     //   32: istore #4
/*     */     //   34: aload_2
/*     */     //   35: invokevirtual getElements$foundation : ()Ljava/util/List;
/*     */     //   38: checkcast java/util/Collection
/*     */     //   41: invokeinterface size : ()I
/*     */     //   46: istore #5
/*     */     //   48: iload #4
/*     */     //   50: iload #5
/*     */     //   52: if_icmpge -> 287
/*     */     //   55: iload #4
/*     */     //   57: ifne -> 67
/*     */     //   60: aload_0
/*     */     //   61: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*     */     //   64: goto -> 80
/*     */     //   67: aload_3
/*     */     //   68: iload #4
/*     */     //   70: iconst_1
/*     */     //   71: isub
/*     */     //   72: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   77: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*     */     //   80: astore #6
/*     */     //   82: aload_2
/*     */     //   83: invokevirtual getElements$foundation : ()Ljava/util/List;
/*     */     //   86: iload #4
/*     */     //   88: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   93: checkcast org/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element
/*     */     //   96: astore #8
/*     */     //   98: aload #8
/*     */     //   100: instanceof org/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Leaf
/*     */     //   103: ifeq -> 166
/*     */     //   106: new org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Leaf
/*     */     //   109: dup
/*     */     //   110: aload #8
/*     */     //   112: checkcast org/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Leaf
/*     */     //   115: invokevirtual getData : ()Ljava/lang/Object;
/*     */     //   118: aload_0
/*     */     //   119: invokevirtual getDepth : ()I
/*     */     //   122: iconst_1
/*     */     //   123: iadd
/*     */     //   124: iload #4
/*     */     //   126: aload_0
/*     */     //   127: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*     */     //   130: aload #6
/*     */     //   132: aconst_null
/*     */     //   133: aload #8
/*     */     //   135: checkcast org/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Leaf
/*     */     //   138: invokevirtual getId : ()Ljava/lang/Object;
/*     */     //   141: dup
/*     */     //   142: ifnonnull -> 157
/*     */     //   145: pop
/*     */     //   146: aload_0
/*     */     //   147: invokevirtual getId : ()Ljava/lang/Object;
/*     */     //   150: iload #4
/*     */     //   152: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;I)Ljava/lang/String;
/*     */     //   157: invokespecial <init> : (Ljava/lang/Object;IILorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Ljava/lang/Object;)V
/*     */     //   160: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*     */     //   163: goto -> 261
/*     */     //   166: aload #8
/*     */     //   168: instanceof org/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node
/*     */     //   171: ifeq -> 253
/*     */     //   174: aload #8
/*     */     //   176: checkcast org/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node
/*     */     //   179: invokevirtual getData : ()Ljava/lang/Object;
/*     */     //   182: astore #9
/*     */     //   184: aload_0
/*     */     //   185: invokevirtual getDepth : ()I
/*     */     //   188: iconst_1
/*     */     //   189: iadd
/*     */     //   190: istore #10
/*     */     //   192: aload #8
/*     */     //   194: checkcast org/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node
/*     */     //   197: invokevirtual getId : ()Ljava/lang/Object;
/*     */     //   200: dup
/*     */     //   201: ifnonnull -> 216
/*     */     //   204: pop
/*     */     //   205: aload_0
/*     */     //   206: invokevirtual getId : ()Ljava/lang/Object;
/*     */     //   209: iload #4
/*     */     //   211: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;I)Ljava/lang/String;
/*     */     //   216: astore #11
/*     */     //   218: new org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   221: dup
/*     */     //   222: aload #9
/*     */     //   224: iload #10
/*     */     //   226: iload #4
/*     */     //   228: aload_0
/*     */     //   229: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*     */     //   232: aload #8
/*     */     //   234: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;)Lkotlin/jvm/functions/Function1;
/*     */     //   239: aconst_null
/*     */     //   240: aload #6
/*     */     //   242: aload #11
/*     */     //   244: invokespecial <init> : (Ljava/lang/Object;IILorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Ljava/lang/Object;)V
/*     */     //   247: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*     */     //   250: goto -> 261
/*     */     //   253: new kotlin/NoWhenBranchMatchedException
/*     */     //   256: dup
/*     */     //   257: invokespecial <init> : ()V
/*     */     //   260: athrow
/*     */     //   261: astore #7
/*     */     //   263: aload #6
/*     */     //   265: aload #7
/*     */     //   267: invokeinterface setNext : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)V
/*     */     //   272: aload_3
/*     */     //   273: aload #7
/*     */     //   275: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   280: pop
/*     */     //   281: iinc #4, 1
/*     */     //   284: goto -> 48
/*     */     //   287: aload_3
/*     */     //   288: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #80	-> 0
/*     */     //   #81	-> 9
/*     */     //   #82	-> 20
/*     */     //   #82	-> 30
/*     */     //   #83	-> 31
/*     */     //   #84	-> 55
/*     */     //   #86	-> 82
/*     */     //   #87	-> 98
/*     */     //   #88	-> 106
/*     */     //   #89	-> 110
/*     */     //   #90	-> 118
/*     */     //   #91	-> 124
/*     */     //   #92	-> 126
/*     */     //   #93	-> 130
/*     */     //   #94	-> 132
/*     */     //   #95	-> 133
/*     */     //   #88	-> 157
/*     */     //   #98	-> 166
/*     */     //   #100	-> 174
/*     */     //   #101	-> 184
/*     */     //   #107	-> 192
/*     */     //   #99	-> 218
/*     */     //   #100	-> 222
/*     */     //   #101	-> 224
/*     */     //   #102	-> 226
/*     */     //   #103	-> 228
/*     */     //   #85	-> 232
/*     */     //   #106	-> 239
/*     */     //   #105	-> 240
/*     */     //   #107	-> 242
/*     */     //   #99	-> 244
/*     */     //   #86	-> 253
/*     */     //   #85	-> 261
/*     */     //   #110	-> 263
/*     */     //   #111	-> 272
/*     */     //   #83	-> 281
/*     */     //   #113	-> 287
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   98	163	8	elementBuilder	Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;
/*     */     //   82	198	6	previous	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */     //   263	17	7	current	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */     //   34	253	4	index	I
/*     */     //   9	280	2	childrenGeneratorScope	Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope;
/*     */     //   31	258	3	elements	Ljava/util/List;
/*     */     //   0	289	0	parent	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;
/*     */     //   0	289	1	parentElementBuilder	Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node;
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
/*     */   private static final List generateElements$lambda$0(TreeBuilder.Element $elementBuilder, Tree.Element.Node<?> it) {
/* 104 */     Intrinsics.checkNotNullParameter(it, "it"); return generateElements(it, (TreeBuilder.Element.Node)$elementBuilder);
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
/*     */   private static final <T> Tree.Element<T> evaluatePrevious(Tree.Element<T> element) {
/* 117 */     Tree.Element<T> element1 = element;
/*     */     
/* 119 */     if (element1 instanceof Tree.Element.Node) {
/* 120 */       List nephews = ((Tree.Element.Node)element).getChildren();
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (element1 instanceof Tree.Element.Leaf) ? element : (Tree.Element<T>)"JD-Core does not support Kotlin";
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
/*     */   @NotNull
/*     */   public static final Tree<File> asTree(@NotNull Path $this$asTree, @NotNull Function1<? super File, Boolean> isOpen) {
/* 156 */     Intrinsics.checkNotNullParameter($this$asTree, "<this>"); Intrinsics.checkNotNullParameter(isOpen, "isOpen"); Intrinsics.checkNotNullExpressionValue($this$asTree.toFile(), "toFile(...)"); return asTree($this$asTree.toFile(), isOpen); } private static final boolean asTree$lambda$1(File it) { Intrinsics.checkNotNullParameter(it, "it"); return false; }
/*     */   @NotNull
/*     */   public static final Tree<File> asTree(@NotNull File $this$asTree, @NotNull Function1 isOpen) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'isOpen'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: aload_1
/*     */     //   14: <illegal opcode> invoke : (Ljava/io/File;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
/*     */     //   19: invokestatic buildTree : (Lkotlin/jvm/functions/Function1;)Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;
/*     */     //   22: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #158	-> 12
/*     */     //   #160	-> 22
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	23	0	$this$asTree	Ljava/io/File;
/* 158 */     //   0	23	1	isOpen	Lkotlin/jvm/functions/Function1; } private static final boolean asTree$lambda$2(File it) { Intrinsics.checkNotNullParameter(it, "it"); return false; }
/* 159 */   private static final Unit asTree$lambda$4$lambda$3(Function1<? super File, Boolean> $isOpen, ChildrenGeneratorScope<File> $this$addNode) { Intrinsics.checkNotNullParameter($this$addNode, "$this$addNode"); generateFileNodes($this$addNode, $isOpen); return Unit.INSTANCE; } private static final Unit asTree$lambda$4(File $this_asTree, Function1 $isOpen, TreeBuilder<File> $this$buildTree) { Intrinsics.checkNotNullParameter($this$buildTree, "$this$buildTree"); $this$buildTree.addNode($this_asTree, $isOpen.invoke($this_asTree), $isOpen::asTree$lambda$4$lambda$3);
/* 160 */     return Unit.INSTANCE; }
/*     */    private static final void generateFileNodes(ChildrenGeneratorScope<File> $this$generateFileNodes, Function1 isOpen) {
/*     */     File[] files;
/* 163 */     if (((File)$this$generateFileNodes.getParent().getData()).listFiles() == null) { ((File)$this$generateFileNodes.getParent().getData()).listFiles(); return; }
/* 164 */      File[] arrayOfFile1 = files;
/* 165 */     int $i$f$sortedBy = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     List list = ArraysKt.sortedWith((Object[])arrayOfFile1, new BuildTreeKt$generateFileNodes$$inlined$sortedBy$1()); int $i$f$forEach = 0;
/* 175 */     Iterator iterator = list.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); File file = (File)element$iv; int $i$a$-forEach-BuildTreeKt$generateFileNodes$2 = 0;
/*     */       if (file.isFile()) {
/*     */         Intrinsics.checkNotNull(file);
/*     */         $this$generateFileNodes.addLeaf(file, file.getAbsolutePath());
/*     */       } else {
/*     */         Intrinsics.checkNotNull(file);
/*     */         $this$generateFileNodes.addNode(file, file.getAbsolutePath(), isOpen::generateFileNodes$lambda$7$lambda$6);
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   private static final Unit generateFileNodes$lambda$7$lambda$6(Function1<? super File, Boolean> $isOpen, ChildrenGeneratorScope<File> $this$addNode) {
/*     */     Intrinsics.checkNotNullParameter($this$addNode, "$this$addNode");
/*     */     generateFileNodes($this$addNode, $isOpen);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\BuildTreeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */