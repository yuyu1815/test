/*    */ package org.jetbrains.jewel.foundation.lazy.tree;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\b\007\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\001\035B\007¢\006\004\b\003\020\004J\037\020\b\032\0020\t2\006\020\n\032\0028\0002\b\020\013\032\004\030\0010\fH\026¢\006\002\020\rJ>\020\016\032\0020\t2\006\020\n\032\0028\0002\b\020\013\032\004\030\0010\f2\035\020\017\032\031\022\n\022\b\022\004\022\0028\0000\021\022\004\022\0020\t0\020¢\006\002\b\022H\026¢\006\002\020\023J\026\020\024\032\0020\t2\f\020\025\032\b\022\004\022\0028\0000\007H\026J\f\020\026\032\b\022\004\022\0028\0000\027J&\020\030\032\b\022\004\022\0028\0000\0312\006\020\032\032\0020\0332\016\020\034\032\n\022\004\022\0028\000\030\0010\031H\002R\032\020\005\032\016\022\n\022\b\022\004\022\0028\0000\0070\006X\004¢\006\002\n\000¨\006\036"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeGeneratorScope;", "<init>", "()V", "heads", "", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "addLeaf", "", "data", "id", "", "(Ljava/lang/Object;Ljava/lang/Object;)V", "addNode", "childrenGenerator", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "add", "element", "build", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;", "getCurrentTreeElement", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "index", "", "previous", "Element", "foundation"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nBuildTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuildTree.kt\norg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
/*    */ public final class TreeBuilder<T> implements TreeGeneratorScope<T> { @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\000\n\002\020\000\n\002\b\007\n\002\030\002\n\002\030\002\n\000\b7\030\000*\004\b\001\020\0012\0020\002:\002\b\tB\t\b\004¢\006\004\b\003\020\004R\024\020\005\032\004\030\0010\002X¦\004¢\006\006\032\004\b\006\020\007\001\002\n\013¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "T", "", "<init>", "()V", "id", "getId", "()Ljava/lang/Object;", "Leaf", "Node", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Leaf;", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node;", "foundation"})
/*    */   @StabilityInferred(parameters = 2)
/*    */   public static abstract class Element<T> { public static final int $stable; private Element() {} @Nullable
/*    */     public abstract Object getId();
/*    */     @GenerateDataFunctions
/*    */     @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\007\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\031\022\006\020\003\032\0028\002\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007R\023\020\003\032\0028\002¢\006\n\n\002\020\n\032\004\b\b\020\tR\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\013\020\t¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Leaf;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "data", "id", "", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getId", "foundation"})
/*    */     @StabilityInferred(parameters = 0)
/*    */     public static final class Leaf<T> extends Element<T> { private final T data; @Nullable
/*    */       private final Object id; public static final int $stable = 8;
/* 13 */       public Leaf(Object data, @Nullable Object id) { super(null); this.data = (T)data; this.id = id; } public final T getData() { return this.data; } @Nullable public Object getId() { return this.id; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Leaf))
/*    */           return false;  Leaf leaf = (Leaf)other; return !Intrinsics.areEqual(this.data, leaf.data) ? false : (!!Intrinsics.areEqual(this.id, leaf.id)); } public int hashCode() { result = (this.data == null) ? 0 : this.data.hashCode(); return result * 31 + ((this.id == null) ? 0 : this.id.hashCode()); }
/*    */       @NotNull public String toString() { return "Leaf(data=" + this.data + ", id=" + this.id + ")"; } }
/*    */     @GenerateDataFunctions @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\t\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B8\022\006\020\003\032\0028\002\022\b\020\004\032\004\030\0010\005\022\035\020\006\032\031\022\n\022\b\022\004\022\0028\0020\b\022\004\022\0020\t0\007¢\006\002\b\n¢\006\004\b\013\020\fR\023\020\003\032\0028\002¢\006\n\n\002\020\017\032\004\b\r\020\016R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\020\020\016R(\020\006\032\031\022\n\022\b\022\004\022\0028\0020\b\022\004\022\0020\t0\007¢\006\002\b\n¢\006\b\n\000\032\004\b\021\020\022¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "data", "id", "", "childrenGenerator", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getId", "getChildrenGenerator", "()Lkotlin/jvm/functions/Function1;", "foundation"}) @StabilityInferred(parameters = 0) public static final class Node<T> extends Element<T> { private final T data; @Nullable private final Object id; @NotNull private final Function1<ChildrenGeneratorScope<T>, Unit> childrenGenerator; public static final int $stable = 8;
/* 17 */       public final T getData() { return this.data; } @Nullable
/* 18 */       public Object getId() { return this.id; } @NotNull
/* 19 */       public final Function1<ChildrenGeneratorScope<T>, Unit> getChildrenGenerator() { return this.childrenGenerator; }
/* 20 */       public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Node)) return false;  Node node = (Node)other; return !Intrinsics.areEqual(this.data, node.data) ? false : (!Intrinsics.areEqual(this.id, node.id) ? false : (!!Intrinsics.areEqual(this.childrenGenerator, node.childrenGenerator))); } public int hashCode() { result = (this.data == null) ? 0 : this.data.hashCode(); result = result * 31 + ((this.id == null) ? 0 : this.id.hashCode()); return result * 31 + this.childrenGenerator.hashCode(); } @NotNull public String toString() { return "Node(data=" + this.data + ", id=" + this.id + ", childrenGenerator=" + this.childrenGenerator + ")"; } public Node(Object data, @Nullable Object id, @NotNull Function1<ChildrenGeneratorScope<T>, Unit> childrenGenerator) { super(null); this.data = (T)data; this.id = id; this.childrenGenerator = childrenGenerator; } } } @GenerateDataFunctions @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\007\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\031\022\006\020\003\032\0028\002\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007R\023\020\003\032\0028\002¢\006\n\n\002\020\n\032\004\b\b\020\tR\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\013\020\t¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Leaf;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "data", "id", "", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getId", "foundation"}) @StabilityInferred(parameters = 0) public static final class Leaf<T> extends Element<T> { private final T data; @Nullable private final Object id; public static final int $stable = 8; public Leaf(Object data, @Nullable Object id) { super(null); this.data = (T)data; this.id = id; } public final T getData() { return this.data; } @Nullable public Object getId() { return this.id; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Leaf)) return false;  Leaf leaf = (Leaf)other; return !Intrinsics.areEqual(this.data, leaf.data) ? false : (!!Intrinsics.areEqual(this.id, leaf.id)); } public int hashCode() { result = (this.data == null) ? 0 : this.data.hashCode(); return result * 31 + ((this.id == null) ? 0 : this.id.hashCode()); } @NotNull public String toString() { return "Leaf(data=" + this.data + ", id=" + this.id + ")"; } } @GenerateDataFunctions @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\t\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B8\022\006\020\003\032\0028\002\022\b\020\004\032\004\030\0010\005\022\035\020\006\032\031\022\n\022\b\022\004\022\0028\0020\b\022\004\022\0020\t0\007¢\006\002\b\n¢\006\004\b\013\020\fR\023\020\003\032\0028\002¢\006\n\n\002\020\017\032\004\b\r\020\016R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\020\020\016R(\020\006\032\031\022\n\022\b\022\004\022\0028\0020\b\022\004\022\0020\t0\007¢\006\002\b\n¢\006\b\n\000\032\004\b\021\020\022¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element$Node;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder$Element;", "data", "id", "", "childrenGenerator", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/tree/ChildrenGeneratorScope;", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getId", "getChildrenGenerator", "()Lkotlin/jvm/functions/Function1;", "foundation"}) @StabilityInferred(parameters = 0) public static final class Node<T> extends Element<T> { private final T data; @Nullable private final Object id; @NotNull private final Function1<ChildrenGeneratorScope<T>, Unit> childrenGenerator; public static final int $stable = 8; public final T getData() { return this.data; } @Nullable public Object getId() { return this.id; } @NotNull public final Function1<ChildrenGeneratorScope<T>, Unit> getChildrenGenerator() { return this.childrenGenerator; } public Node(Object data, @Nullable Object id, @NotNull Function1<ChildrenGeneratorScope<T>, Unit> childrenGenerator) { super(null); this.data = (T)data; this.id = id; this.childrenGenerator = childrenGenerator; }
/*    */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Node)) return false;  Node node = (Node)other; return !Intrinsics.areEqual(this.data, node.data) ? false : (!Intrinsics.areEqual(this.id, node.id) ? false : (!!Intrinsics.areEqual(this.childrenGenerator, node.childrenGenerator))); }
/*    */     public int hashCode() { result = (this.data == null) ? 0 : this.data.hashCode(); result = result * 31 + ((this.id == null) ? 0 : this.id.hashCode()); return result * 31 + this.childrenGenerator.hashCode(); }
/* 23 */     @NotNull public String toString() { return "Node(data=" + this.data + ", id=" + this.id + ", childrenGenerator=" + this.childrenGenerator + ")"; } } @NotNull private final List<Element<T>> heads = new ArrayList<>(); public static final int $stable = 8;
/*    */   
/*    */   public void addLeaf(Object data, @Nullable Object id) {
/* 26 */     this.heads.add(new Element.Leaf<>((T)data, id));
/*    */   }
/*    */   
/*    */   public void addNode(Object data, @Nullable Object id, @NotNull Function1<? super ChildrenGeneratorScope<T>, Unit> childrenGenerator) {
/* 30 */     Intrinsics.checkNotNullParameter(childrenGenerator, "childrenGenerator"); this.heads.add(new Element.Node<>((T)data, id, childrenGenerator));
/*    */   }
/*    */   
/*    */   public void add(@NotNull Element<T> element) {
/* 34 */     Intrinsics.checkNotNullParameter(element, "element"); this.heads.add(element);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Tree<T> build() {
/*    */     // Byte code:
/*    */     //   0: new java/util/ArrayList
/*    */     //   3: dup
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: checkcast java/util/List
/*    */     //   10: astore_1
/*    */     //   11: iconst_0
/*    */     //   12: istore_2
/*    */     //   13: aload_0
/*    */     //   14: getfield heads : Ljava/util/List;
/*    */     //   17: checkcast java/util/Collection
/*    */     //   20: invokeinterface size : ()I
/*    */     //   25: istore_3
/*    */     //   26: iload_2
/*    */     //   27: iload_3
/*    */     //   28: if_icmpge -> 115
/*    */     //   31: aload_1
/*    */     //   32: iload_2
/*    */     //   33: iconst_1
/*    */     //   34: isub
/*    */     //   35: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*    */     //   38: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*    */     //   41: dup
/*    */     //   42: ifnull -> 58
/*    */     //   45: astore #7
/*    */     //   47: iconst_0
/*    */     //   48: istore #8
/*    */     //   50: aload #7
/*    */     //   52: invokestatic access$evaluatePrevious : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*    */     //   55: goto -> 60
/*    */     //   58: pop
/*    */     //   59: aconst_null
/*    */     //   60: astore #4
/*    */     //   62: aload_0
/*    */     //   63: iload_2
/*    */     //   64: aload #4
/*    */     //   66: invokespecial getCurrentTreeElement : (ILorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*    */     //   69: astore #5
/*    */     //   71: aload_1
/*    */     //   72: aload #5
/*    */     //   74: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   79: pop
/*    */     //   80: aload #4
/*    */     //   82: dup
/*    */     //   83: ifnull -> 107
/*    */     //   86: astore #6
/*    */     //   88: aload #6
/*    */     //   90: astore #7
/*    */     //   92: iconst_0
/*    */     //   93: istore #8
/*    */     //   95: aload #7
/*    */     //   97: aload #5
/*    */     //   99: invokeinterface setNext : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)V
/*    */     //   104: goto -> 109
/*    */     //   107: pop
/*    */     //   108: nop
/*    */     //   109: iinc #2, 1
/*    */     //   112: goto -> 26
/*    */     //   115: new org/jetbrains/jewel/foundation/lazy/tree/Tree
/*    */     //   118: dup
/*    */     //   119: aload_1
/*    */     //   120: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   123: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 0
/*    */     //   #38	-> 10
/*    */     //   #39	-> 11
/*    */     //   #40	-> 31
/*    */     //   #174	-> 47
/*    */     //   #40	-> 50
/*    */     //   #40	-> 55
/*    */     //   #40	-> 58
/*    */     //   #42	-> 62
/*    */     //   #43	-> 71
/*    */     //   #44	-> 80
/*    */     //   #174	-> 92
/*    */     //   #44	-> 95
/*    */     //   #44	-> 104
/*    */     //   #44	-> 107
/*    */     //   #39	-> 109
/*    */     //   #46	-> 115
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   50	5	8	$i$a$-let-TreeBuilder$build$previous$1	I
/*    */     //   47	8	7	it	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*    */     //   95	9	8	$i$a$-also-TreeBuilder$build$1	I
/*    */     //   92	12	7	it	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*    */     //   62	47	4	previous	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*    */     //   71	38	5	current	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*    */     //   13	102	2	index	I
/*    */     //   11	113	1	elements	Ljava/util/List;
/*    */     //   0	124	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/TreeBuilder;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final Tree.Element<T> getCurrentTreeElement(int index, Tree.Element<T> previous) {
/* 50 */     Element elementBuilder = this.heads.get(index);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 59 */     if (((Element.Leaf)elementBuilder).getId() == null) ((Element.Leaf)elementBuilder).getId();  super(false, index, null, previous, null, (Tree.Element<T>)((Element.Leaf)elementBuilder).getId(), String.valueOf(index));
/*    */ 
/*    */     
/* 62 */     if (elementBuilder instanceof Element.Node) {
/*    */       
/* 64 */       Object object = ((Element.Node<Object>)elementBuilder).getData();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 71 */       if (((Element.Node)elementBuilder).getId() == null) ((Element.Node)elementBuilder).getId();  String str = String.valueOf(index);
/*    */     } else {
/*    */       throw new NoWhenBranchMatchedException();
/*    */     } 
/*    */     return (elementBuilder instanceof Element.Leaf) ? new Tree.Element.Leaf<>() : (Tree.Element<T>)"JD-Core does not support Kotlin";
/*    */   }
/*    */   
/*    */   private static final List getCurrentTreeElement$lambda$2(Element $elementBuilder, Tree.Element.Node parent) {
/*    */     Intrinsics.checkNotNullParameter(parent, "parent");
/*    */     return BuildTreeKt.access$generateElements(parent, (Element.Node)$elementBuilder);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\TreeBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */