/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\030\002\n\002\b\006\b\007\030\000 \021*\004\b\000\020\0012\0020\002:\002\021\022B\035\b\000\022\022\020\003\032\016\022\n\022\b\022\004\022\0028\0000\0050\004¢\006\004\b\006\020\007J\006\020\n\032\0020\013J\034\020\f\032\016\022\n\022\b\022\004\022\0028\0000\0050\r2\006\020\016\032\0020\013H\002J\022\020\017\032\016\022\n\022\b\022\004\022\0028\0000\0050\rJ\022\020\020\032\016\022\n\022\b\022\004\022\0028\0000\0050\rR\035\020\003\032\016\022\n\022\b\022\004\022\0028\0000\0050\004¢\006\b\n\000\032\004\b\b\020\t¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;", "T", "", "roots", "", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "<init>", "(Ljava/util/List;)V", "getRoots", "()Ljava/util/List;", "isEmpty", "", "walk", "Lkotlin/sequences/Sequence;", "breathFirst", "walkBreadthFirst", "walkDepthFirst", "Companion", "Element", "foundation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class Tree<T> {
/*   7 */   public Tree(@NotNull List<Element<T>> roots) { this.roots = roots; } @NotNull public final List<Element<T>> getRoots() { return this.roots; } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\034\020\004\032\n\022\006\022\004\030\0010\0010\005X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Companion;", "", "<init>", "()V", "EMPTY", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;", "getEMPTY$foundation", "()Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;", "foundation"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*   9 */     public final Tree<Object> getEMPTY$foundation() { return Tree.EMPTY; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final List<Element<T>> roots; public static final int $stable = 8; @NotNull private static final Tree<Object> EMPTY = new Tree(CollectionsKt.emptyList());
/*     */   
/*     */   public final boolean isEmpty() {
/*  12 */     return this.roots.isEmpty();
/*     */   } private final Sequence<Element<T>> walk(boolean breathFirst) {
/*  14 */     return SequencesKt.sequence(new Tree$walk$1(breathFirst, null));
/*     */   } @DebugMetadata(f = "Tree.kt", l = {18}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"$this$sequence", "queue", "next"}, m = "invokeSuspend", c = "org.jetbrains.jewel.foundation.lazy.tree.Tree$walk$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\016\022\n\022\b\022\004\022\002H\0020\0040\003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;"})
/*     */   static final class Tree$walk$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Element<T>>, Continuation<? super Unit>, Object> {
/*     */     Object L$1; Object L$2; int label; Tree$walk$1(boolean $breathFirst, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     } public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #5
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 246, 0 -> 32, 1 -> 127
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast kotlin/sequences/SequenceScope
/*     */       //   43: astore_2
/*     */       //   44: aload_0
/*     */       //   45: getfield this$0 : Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;
/*     */       //   48: invokevirtual getRoots : ()Ljava/util/List;
/*     */       //   51: checkcast java/util/Collection
/*     */       //   54: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*     */       //   57: astore_3
/*     */       //   58: aload_3
/*     */       //   59: checkcast java/util/Collection
/*     */       //   62: invokeinterface isEmpty : ()Z
/*     */       //   67: ifne -> 74
/*     */       //   70: iconst_1
/*     */       //   71: goto -> 75
/*     */       //   74: iconst_0
/*     */       //   75: ifeq -> 242
/*     */       //   78: aload_3
/*     */       //   79: invokestatic removeFirst : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   82: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*     */       //   85: astore #4
/*     */       //   87: aload_2
/*     */       //   88: aload #4
/*     */       //   90: aload_0
/*     */       //   91: checkcast kotlin/coroutines/Continuation
/*     */       //   94: aload_0
/*     */       //   95: aload_2
/*     */       //   96: putfield L$0 : Ljava/lang/Object;
/*     */       //   99: aload_0
/*     */       //   100: aload_3
/*     */       //   101: putfield L$1 : Ljava/lang/Object;
/*     */       //   104: aload_0
/*     */       //   105: aload #4
/*     */       //   107: putfield L$2 : Ljava/lang/Object;
/*     */       //   110: aload_0
/*     */       //   111: iconst_1
/*     */       //   112: putfield label : I
/*     */       //   115: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   118: dup
/*     */       //   119: aload #5
/*     */       //   121: if_acmpne -> 157
/*     */       //   124: aload #5
/*     */       //   126: areturn
/*     */       //   127: aload_0
/*     */       //   128: getfield L$2 : Ljava/lang/Object;
/*     */       //   131: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*     */       //   134: astore #4
/*     */       //   136: aload_0
/*     */       //   137: getfield L$1 : Ljava/lang/Object;
/*     */       //   140: checkcast java/util/List
/*     */       //   143: astore_3
/*     */       //   144: aload_0
/*     */       //   145: getfield L$0 : Ljava/lang/Object;
/*     */       //   148: checkcast kotlin/sequences/SequenceScope
/*     */       //   151: astore_2
/*     */       //   152: aload_1
/*     */       //   153: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   156: aload_1
/*     */       //   157: pop
/*     */       //   158: aload #4
/*     */       //   160: instanceof org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */       //   163: ifeq -> 58
/*     */       //   166: aload #4
/*     */       //   168: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */       //   171: iconst_0
/*     */       //   172: iconst_1
/*     */       //   173: aconst_null
/*     */       //   174: invokestatic open$default : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;ZILjava/lang/Object;)V
/*     */       //   177: aload_0
/*     */       //   178: getfield $breathFirst : Z
/*     */       //   181: ifeq -> 212
/*     */       //   184: aload_3
/*     */       //   185: aload #4
/*     */       //   187: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */       //   190: invokevirtual getChildren : ()Ljava/util/List;
/*     */       //   193: dup
/*     */       //   194: ifnonnull -> 201
/*     */       //   197: pop
/*     */       //   198: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   201: checkcast java/util/Collection
/*     */       //   204: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */       //   209: goto -> 238
/*     */       //   212: aload_3
/*     */       //   213: iconst_0
/*     */       //   214: aload #4
/*     */       //   216: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */       //   219: invokevirtual getChildren : ()Ljava/util/List;
/*     */       //   222: dup
/*     */       //   223: ifnonnull -> 230
/*     */       //   226: pop
/*     */       //   227: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   230: checkcast java/util/Collection
/*     */       //   233: invokeinterface addAll : (ILjava/util/Collection;)Z
/*     */       //   238: pop
/*     */       //   239: goto -> 58
/*     */       //   242: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   245: areturn
/*     */       //   246: new java/lang/IllegalStateException
/*     */       //   249: dup
/*     */       //   250: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   252: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   255: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #14	-> 3
/*     */       //   #15	-> 44
/*     */       //   #16	-> 58
/*     */       //   #17	-> 78
/*     */       //   #18	-> 87
/*     */       //   #14	-> 124
/*     */       //   #19	-> 157
/*     */       //   #20	-> 166
/*     */       //   #21	-> 177
/*     */       //   #22	-> 184
/*     */       //   #22	-> 204
/*     */       //   #24	-> 212
/*     */       //   #24	-> 233
/*     */       //   #28	-> 242
/*     */       //   #14	-> 246
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	83	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   152	49	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   201	29	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   230	16	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   58	69	3	queue	Ljava/util/List;
/*     */       //   144	57	3	queue	Ljava/util/List;
/*     */       //   201	29	3	queue	Ljava/util/List;
/*     */       //   230	16	3	queue	Ljava/util/List;
/*     */       //   87	40	4	next	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */       //   136	65	4	next	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */       //   212	18	4	next	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */       //   0	256	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$walk$1;
/*     */       //   36	210	1	$result	Ljava/lang/Object;
/*     */     } public final Continuation<Unit> create(Object value, Continuation<? super Tree$walk$1> $completion) {
/*     */       Tree$walk$1 tree$walk$1 = new Tree$walk$1(this.$breathFirst, $completion);
/*     */       tree$walk$1.L$0 = value;
/*     */       return (Continuation<Unit>)tree$walk$1;
/*     */     } public final Object invoke(SequenceScope p1, Continuation<?> p2) {
/*     */       return ((Tree$walk$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   @NotNull
/*  30 */   public final Sequence<Element<T>> walkBreadthFirst() { return walk(true); } @NotNull
/*     */   public final Sequence<Element<T>> walkDepthFirst() {
/*  32 */     return walk(false);
/*     */   } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\020\000\n\002\b\004\n\002\020\b\n\002\b\021\n\002\020 \n\000\n\002\020\034\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bv\030\000*\004\b\001\020\0012\0020\002:\002\035\036J\024\020\030\032\016\022\n\022\b\022\004\022\0028\0010\0000\031H\026J\024\020\032\032\016\022\n\022\b\022\004\022\0028\0010\0000\033H\026J\024\020\034\032\016\022\n\022\b\022\004\022\0028\0010\0000\033H\026R\022\020\003\032\0028\001X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\032\020\n\032\n\022\004\022\0028\001\030\0010\000X¦\004¢\006\006\032\004\b\013\020\fR\022\020\r\032\0020\007X¦\004¢\006\006\032\004\b\016\020\tR \020\017\032\n\022\004\022\0028\001\030\0010\000X¦\016¢\006\f\032\004\b\020\020\f\"\004\b\021\020\022R \020\023\032\n\022\004\022\0028\001\030\0010\000X¦\016¢\006\f\032\004\b\024\020\f\"\004\b\025\020\022R\022\020\026\032\0020\002X¦\004¢\006\006\032\004\b\027\020\005\001\002\037 ¨\006!"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "T", "", "data", "getData", "()Ljava/lang/Object;", "depth", "", "getDepth", "()I", "parent", "getParent", "()Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "childIndex", "getChildIndex", "next", "getNext", "setNext", "(Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)V", "previous", "getPrevious", "setPrevious", "id", "getId", "path", "", "previousElementsIterable", "", "nextElementsIterable", "Leaf", "Node", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Leaf;", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;", "foundation"})
/*     */   public static interface Element<T> { T getData(); int getDepth(); @Nullable
/*     */     Element<T> getParent(); int getChildIndex(); @Nullable
/*     */     Element<T> getNext(); void setNext(@Nullable Element<T> param1Element); @Nullable
/*     */     Element<T> getPrevious(); void setPrevious(@Nullable Element<T> param1Element); @NotNull
/*     */     Object getId(); @NotNull
/*     */     List<Element<T>> path(); @NotNull
/*     */     Iterable<Element<T>> previousElementsIterable(); @NotNull
/*     */     Iterable<Element<T>> nextElementsIterable();
/*     */     @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */     public static final class DefaultImpls { @NotNull
/*  44 */       public static <T> List<Tree.Element<T>> path(@NotNull Tree.Element $this) { List<Tree.Element> list1 = CollectionsKt.createListBuilder(), $this$path_u24lambda_u240 = list1; int $i$a$-buildList-Tree$Element$path$1 = 0;
/*  45 */         Tree.Element next = $this;
/*  46 */         while (next != null) {
/*  47 */           $this$path_u24lambda_u240.add(next);
/*  48 */           next = next.getParent();
/*     */         } 
/*     */         
/*  51 */         return CollectionsKt.reversed(CollectionsKt.build(list1)); } @NotNull
/*     */       public static <T> Iterable<Tree.Element<T>> previousElementsIterable(@NotNull Tree.Element $this) {
/*  53 */         return new Tree$Element$DefaultImpls$previousElementsIterable$$inlined$Iterable$1($this);
/*     */       }
/*     */       
/*     */       @NotNull
/*  57 */       public static <T> Iterable<Tree.Element<T>> nextElementsIterable(@NotNull Tree.Element $this) { return new Tree$Element$DefaultImpls$nextElementsIterable$$inlined$Iterable$1($this); } }
/*     */      @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\000\n\002\b\021\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002BW\022\006\020\003\032\0028\002\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\016\020\007\032\n\022\004\022\0028\002\030\0010\002\022\016\020\b\032\n\022\004\022\0028\002\030\0010\002\022\016\020\t\032\n\022\004\022\0028\002\030\0010\002\022\006\020\n\032\0020\013¢\006\004\b\f\020\rR\026\020\003\032\0028\002X\004¢\006\n\n\002\020\020\032\004\b\016\020\017R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b\023\020\022R\034\020\007\032\n\022\004\022\0028\002\030\0010\002X\004¢\006\b\n\000\032\004\b\024\020\025R\"\020\b\032\n\022\004\022\0028\002\030\0010\002X\016¢\006\016\n\000\032\004\b\026\020\025\"\004\b\027\020\030R\"\020\t\032\n\022\004\022\0028\002\030\0010\002X\016¢\006\016\n\000\032\004\b\031\020\025\"\004\b\032\020\030R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\033\020\017¨\006\034"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Leaf;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "data", "depth", "", "childIndex", "parent", "previous", "next", "id", "", "<init>", "(Ljava/lang/Object;IILorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDepth", "()I", "getChildIndex", "getParent", "()Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "getPrevious", "setPrevious", "(Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)V", "getNext", "setNext", "getId", "foundation"}) @StabilityInferred(parameters = 0) public static final class Leaf<T> implements Element<T>
/*     */     {
/*  60 */       private final T data; private final int depth; private final int childIndex; @Nullable private final Tree.Element<T> parent; @Nullable private Tree.Element<T> previous; @Nullable private Tree.Element<T> next; @NotNull private final Object id; public static final int $stable = 8; @NotNull public List<Tree.Element<T>> path() { return Tree.Element.DefaultImpls.path(this); } @NotNull public Iterable<Tree.Element<T>> previousElementsIterable() { return Tree.Element.DefaultImpls.previousElementsIterable(this); } @NotNull public Iterable<Tree.Element<T>> nextElementsIterable() { return Tree.Element.DefaultImpls.nextElementsIterable(this); } public T getData() { return this.data; } public int getDepth() { return this.depth; } public int getChildIndex() { return this.childIndex; } public Leaf(Object data, int depth, int childIndex, @Nullable Tree.Element<T> parent, @Nullable Tree.Element<T> previous, @Nullable Tree.Element<T> next, @NotNull Object id) { this.data = (T)data;
/*  61 */         this.depth = depth;
/*  62 */         this.childIndex = childIndex;
/*  63 */         this.parent = parent;
/*  64 */         this.previous = previous;
/*  65 */         this.next = next;
/*  66 */         this.id = id; } @Nullable public Tree.Element<T> getParent() { return this.parent; } @Nullable public Tree.Element<T> getPrevious() { return this.previous; } public void setPrevious(@Nullable Tree.Element<T> <set-?>) { this.previous = <set-?>; } @Nullable public Tree.Element<T> getNext() { return this.next; } public void setNext(@Nullable Tree.Element<T> <set-?>) { this.next = <set-?>; } @NotNull public Object getId() { return this.id; } } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\b\003\n\002\020\000\n\002\b\025\n\002\020\002\n\002\b\004\n\002\020\013\n\002\b\003\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\001\022\006\020\003\032\0028\002\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\016\020\007\032\n\022\004\022\0028\002\030\0010\002\0223\020\b\032/\022\031\022\027\022\004\022\0028\0020\000¢\006\f\b\n\022\b\b\013\022\004\b\b(\007\022\020\022\016\022\n\022\b\022\004\022\0028\0020\0020\f0\t\022\016\020\r\032\n\022\004\022\0028\002\030\0010\002\022\016\020\016\032\n\022\004\022\0028\002\030\0010\002\022\006\020\017\032\0020\020¢\006\004\b\021\020\022J\b\020%\032\0020&H\002J\b\020'\032\0020&H\002J\b\020(\032\0020&H\002J\020\020)\032\0020&2\b\b\002\020*\032\0020+J\006\020,\032\0020&J\b\020-\032\0020&H\002R\026\020\003\032\0028\002X\004¢\006\n\n\002\020\025\032\004\b\023\020\024R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\026\020\027R\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b\030\020\027R\034\020\007\032\n\022\004\022\0028\002\030\0010\002X\004¢\006\b\n\000\032\004\b\031\020\032R;\020\b\032/\022\031\022\027\022\004\022\0028\0020\000¢\006\f\b\n\022\b\b\013\022\004\b\b(\007\022\020\022\016\022\n\022\b\022\004\022\0028\0020\0020\f0\tX\004¢\006\002\n\000R\"\020\r\032\n\022\004\022\0028\002\030\0010\002X\016¢\006\016\n\000\032\004\b\033\020\032\"\004\b\034\020\035R\"\020\016\032\n\022\004\022\0028\002\030\0010\002X\016¢\006\016\n\000\032\004\b\036\020\032\"\004\b\037\020\035R\024\020\017\032\0020\020X\004¢\006\b\n\000\032\004\b \020\024R:\020\"\032\020\022\n\022\b\022\004\022\0028\0020\002\030\0010\f2\024\020!\032\020\022\n\022\b\022\004\022\0028\0020\002\030\0010\f@BX\016¢\006\b\n\000\032\004\b#\020$¨\006."}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "data", "depth", "", "childIndex", "parent", "childrenGenerator", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "next", "previous", "id", "", "<init>", "(Ljava/lang/Object;IILorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDepth", "()I", "getChildIndex", "getParent", "()Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "getNext", "setNext", "(Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)V", "getPrevious", "setPrevious", "getId", "value", "children", "getChildren", "()Ljava/util/List;", "evaluateChildren", "", "connectChildren", "detachChildren", "open", "reloadChildren", "", "close", "closeRecursively", "foundation"}) @StabilityInferred(parameters = 0) @SourceDebugExtension({"SMAP\nTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tree.kt\norg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n473#2:132\n1313#2,2:133\n1855#3,2:135\n*S KotlinDebug\n*F\n+ 1 Tree.kt\norg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node\n*L\n113#1:132\n113#1:133,2\n117#1:135,2\n*E\n"}) public static final class Node<T> implements Element<T> { private final T data; private final int depth; private final int childIndex; @Nullable private final Tree.Element<T> parent; @NotNull private final Function1<Node<T>, List<Tree.Element<T>>> childrenGenerator; @Nullable
/*     */       private Tree.Element<T> next; @Nullable
/*     */       private Tree.Element<T> previous; @NotNull
/*     */       private final Object id; @Nullable
/*  70 */       private List<? extends Tree.Element<T>> children; public static final int $stable = 8; public Node(Object data, int depth, int childIndex, @Nullable Tree.Element<T> parent, @NotNull Function1<Node<T>, List<Tree.Element<T>>> childrenGenerator, @Nullable Tree.Element<T> next, @Nullable Tree.Element<T> previous, @NotNull Object id) { this.data = (T)data;
/*  71 */         this.depth = depth;
/*  72 */         this.childIndex = childIndex;
/*  73 */         this.parent = parent;
/*  74 */         this.childrenGenerator = childrenGenerator;
/*  75 */         this.next = next;
/*  76 */         this.previous = previous;
/*  77 */         this.id = id; } @NotNull public List<Tree.Element<T>> path() { return Tree.Element.DefaultImpls.path(this); } @NotNull public Iterable<Tree.Element<T>> previousElementsIterable() { return Tree.Element.DefaultImpls.previousElementsIterable(this); } @NotNull public Iterable<Tree.Element<T>> nextElementsIterable() { return Tree.Element.DefaultImpls.nextElementsIterable(this); } public T getData() { return this.data; } public int getDepth() { return this.depth; } public int getChildIndex() { return this.childIndex; } @Nullable public Tree.Element<T> getParent() { return this.parent; } @Nullable public Tree.Element<T> getNext() { return this.next; } public void setNext(@Nullable Tree.Element<T> <set-?>) { this.next = <set-?>; } @Nullable public Tree.Element<T> getPrevious() { return this.previous; } public void setPrevious(@Nullable Tree.Element<T> <set-?>) { this.previous = <set-?>; } @NotNull public Object getId() { return this.id; } @Nullable
/*     */       public final List<Tree.Element<T>> getChildren() {
/*  79 */         return (List)this.children;
/*     */       }
/*     */       
/*     */       private final void evaluateChildren() {
/*  83 */         this.children = (List<? extends Tree.Element<T>>)this.childrenGenerator.invoke(this);
/*     */       }
/*     */       private final void connectChildren() {
/*     */         List<? extends Tree.Element<T>> children;
/*  87 */         if (this.children == null)
/*  88 */           return;  if (!children.isEmpty()) {
/*  89 */           Tree.Element<T> element1 = getNext(), it = element1; int $i$a$-also-Tree$Element$Node$connectChildren$1 = 0;
/*  90 */           it.setPrevious((Tree.Element<T>)CollectionsKt.last(children));
/*  91 */           ((Tree.Element<T>)CollectionsKt.last(children)).setNext(it);
/*     */           getNext();
/*  93 */           setNext((Tree.Element<T>)CollectionsKt.first(children));
/*  94 */           ((Tree.Element)CollectionsKt.first(children)).setPrevious(this);
/*     */         } 
/*     */       }
/*     */       private final void detachChildren() {
/*     */         List<? extends Tree.Element<T>> children;
/*  99 */         if (this.children == null)
/* 100 */           return;  if (!children.isEmpty()) {
/* 101 */           setNext(((Tree.Element<T>)CollectionsKt.last(children)).getNext());
/* 102 */           if (getNext() != null) { getNext().setPrevious(this); } else { getNext(); }
/*     */         
/*     */         } 
/*     */       }
/*     */       public final void open(boolean reloadChildren) {
/* 107 */         if (reloadChildren || this.children == null) evaluateChildren(); 
/* 108 */         connectChildren();
/*     */       }
/*     */       
/*     */       public final void close() {
/*     */         // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: invokespecial detachChildren : ()V
/*     */         //   4: aload_0
/*     */         //   5: getfield children : Ljava/util/List;
/*     */         //   8: dup
/*     */         //   9: ifnull -> 95
/*     */         //   12: checkcast java/lang/Iterable
/*     */         //   15: invokestatic asSequence : (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
/*     */         //   18: dup
/*     */         //   19: ifnull -> 95
/*     */         //   22: astore_1
/*     */         //   23: iconst_0
/*     */         //   24: istore_2
/*     */         //   25: aload_1
/*     */         //   26: getstatic org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node$close$$inlined$filterIsInstance$1.INSTANCE : Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node$close$$inlined$filterIsInstance$1;
/*     */         //   29: checkcast kotlin/jvm/functions/Function1
/*     */         //   32: invokestatic filter : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */         //   35: dup
/*     */         //   36: ldc 'null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>'
/*     */         //   38: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   41: dup
/*     */         //   42: ifnull -> 95
/*     */         //   45: astore_1
/*     */         //   46: iconst_0
/*     */         //   47: istore_2
/*     */         //   48: aload_1
/*     */         //   49: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */         //   54: astore_3
/*     */         //   55: aload_3
/*     */         //   56: invokeinterface hasNext : ()Z
/*     */         //   61: ifeq -> 91
/*     */         //   64: aload_3
/*     */         //   65: invokeinterface next : ()Ljava/lang/Object;
/*     */         //   70: astore #4
/*     */         //   72: aload #4
/*     */         //   74: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */         //   77: astore #5
/*     */         //   79: iconst_0
/*     */         //   80: istore #6
/*     */         //   82: aload #5
/*     */         //   84: invokespecial closeRecursively : ()V
/*     */         //   87: nop
/*     */         //   88: goto -> 55
/*     */         //   91: nop
/*     */         //   92: goto -> 97
/*     */         //   95: pop
/*     */         //   96: nop
/*     */         //   97: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #112	-> 0
/*     */         //   #113	-> 4
/*     */         //   #132	-> 25
/*     */         //   #113	-> 41
/*     */         //   #133	-> 48
/*     */         //   #113	-> 82
/*     */         //   #133	-> 87
/*     */         //   #134	-> 91
/*     */         //   #113	-> 95
/*     */         //   #114	-> 97
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   25	16	2	$i$f$filterIsInstance	I
/*     */         //   23	18	1	$this$filterIsInstance$iv	Lkotlin/sequences/Sequence;
/*     */         //   82	5	6	$i$a$-forEach-Tree$Element$Node$close$1	I
/*     */         //   79	8	5	it	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;
/*     */         //   72	16	4	element$iv	Ljava/lang/Object;
/*     */         //   48	44	2	$i$f$forEach	I
/*     */         //   46	46	1	$this$forEach$iv	Lkotlin/sequences/Sequence;
/*     */         //   0	98	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;
/*     */       }
/*     */       
/*     */       private final void closeRecursively() {
/*     */         Iterator<? extends Tree.Element<T>> iterator;
/* 117 */         if (this.children != null) { Iterable<? extends Tree.Element<T>> $this$forEach$iv = this.children; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 135 */           iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object<T> element$iv = (Object<T>)iterator.next(); Tree.Element it = (Tree.Element)element$iv; int $i$a$-forEach-Tree$Element$Node$closeRecursively$1 = 0;
/*     */           if (it instanceof Node)
/*     */             ((Node)it).closeRecursively();  }
/*     */       
/*     */       } }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\Tree.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */