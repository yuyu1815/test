/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\020\000\n\002\b\004\n\002\020\b\n\002\b\021\n\002\020 \n\000\n\002\020\034\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bv\030\000*\004\b\001\020\0012\0020\002:\002\035\036J\024\020\030\032\016\022\n\022\b\022\004\022\0028\0010\0000\031H\026J\024\020\032\032\016\022\n\022\b\022\004\022\0028\0010\0000\033H\026J\024\020\034\032\016\022\n\022\b\022\004\022\0028\0010\0000\033H\026R\022\020\003\032\0028\001X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\032\020\n\032\n\022\004\022\0028\001\030\0010\000X¦\004¢\006\006\032\004\b\013\020\fR\022\020\r\032\0020\007X¦\004¢\006\006\032\004\b\016\020\tR \020\017\032\n\022\004\022\0028\001\030\0010\000X¦\016¢\006\f\032\004\b\020\020\f\"\004\b\021\020\022R \020\023\032\n\022\004\022\0028\001\030\0010\000X¦\016¢\006\f\032\004\b\024\020\f\"\004\b\025\020\022R\022\020\026\032\0020\002X¦\004¢\006\006\032\004\b\027\020\005\001\002\037 ¨\006!"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "T", "", "data", "getData", "()Ljava/lang/Object;", "depth", "", "getDepth", "()I", "parent", "getParent", "()Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "childIndex", "getChildIndex", "next", "getNext", "setNext", "(Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)V", "previous", "getPrevious", "setPrevious", "id", "getId", "path", "", "previousElementsIterable", "", "nextElementsIterable", "Leaf", "Node", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Leaf;", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;", "foundation"})
/*     */ public interface Element<T> {
/*     */   T getData();
/*     */   
/*     */   int getDepth();
/*     */   
/*     */   @Nullable
/*     */   Element<T> getParent();
/*     */   
/*     */   int getChildIndex();
/*     */   
/*     */   @Nullable
/*     */   Element<T> getNext();
/*     */   
/*     */   void setNext(@Nullable Element<T> paramElement);
/*     */   
/*     */   @Nullable
/*     */   Element<T> getPrevious();
/*     */   
/*     */   void setPrevious(@Nullable Element<T> paramElement);
/*     */   
/*     */   @NotNull
/*     */   Object getId();
/*     */   
/*     */   @NotNull
/*     */   List<Element<T>> path();
/*     */   
/*     */   @NotNull
/*     */   Iterable<Element<T>> previousElementsIterable();
/*     */   
/*     */   @NotNull
/*     */   Iterable<Element<T>> nextElementsIterable();
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls {
/*     */     @NotNull
/*  44 */     public static <T> List<Tree.Element<T>> path(@NotNull Tree.Element $this) { List<Tree.Element> list1 = CollectionsKt.createListBuilder(), $this$path_u24lambda_u240 = list1; int $i$a$-buildList-Tree$Element$path$1 = 0;
/*  45 */       Tree.Element next = $this;
/*  46 */       while (next != null) {
/*  47 */         $this$path_u24lambda_u240.add(next);
/*  48 */         next = next.getParent();
/*     */       } 
/*     */       
/*  51 */       return CollectionsKt.reversed(CollectionsKt.build(list1)); } @NotNull
/*     */     public static <T> Iterable<Tree.Element<T>> previousElementsIterable(@NotNull Tree.Element $this) {
/*  53 */       return new Tree$Element$DefaultImpls$previousElementsIterable$$inlined$Iterable$1($this);
/*     */     }
/*     */     
/*     */     @NotNull
/*  57 */     public static <T> Iterable<Tree.Element<T>> nextElementsIterable(@NotNull Tree.Element $this) { return new Tree$Element$DefaultImpls$nextElementsIterable$$inlined$Iterable$1($this); }
/*     */   } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\005\n\002\020\000\n\002\b\021\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002BW\022\006\020\003\032\0028\002\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\016\020\007\032\n\022\004\022\0028\002\030\0010\002\022\016\020\b\032\n\022\004\022\0028\002\030\0010\002\022\016\020\t\032\n\022\004\022\0028\002\030\0010\002\022\006\020\n\032\0020\013¢\006\004\b\f\020\rR\026\020\003\032\0028\002X\004¢\006\n\n\002\020\020\032\004\b\016\020\017R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b\023\020\022R\034\020\007\032\n\022\004\022\0028\002\030\0010\002X\004¢\006\b\n\000\032\004\b\024\020\025R\"\020\b\032\n\022\004\022\0028\002\030\0010\002X\016¢\006\016\n\000\032\004\b\026\020\025\"\004\b\027\020\030R\"\020\t\032\n\022\004\022\0028\002\030\0010\002X\016¢\006\016\n\000\032\004\b\031\020\025\"\004\b\032\020\030R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\033\020\017¨\006\034"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Leaf;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "data", "depth", "", "childIndex", "parent", "previous", "next", "id", "", "<init>", "(Ljava/lang/Object;IILorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDepth", "()I", "getChildIndex", "getParent", "()Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "getPrevious", "setPrevious", "(Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)V", "getNext", "setNext", "getId", "foundation"}) @StabilityInferred(parameters = 0) public static final class Leaf<T> implements Element<T>
/*     */   {
/*  60 */     private final T data; private final int depth; private final int childIndex; @Nullable private final Tree.Element<T> parent; @Nullable private Tree.Element<T> previous; @Nullable private Tree.Element<T> next; @NotNull private final Object id; public static final int $stable = 8; @NotNull public List<Tree.Element<T>> path() { return Tree.Element.DefaultImpls.path(this); } @NotNull public Iterable<Tree.Element<T>> previousElementsIterable() { return Tree.Element.DefaultImpls.previousElementsIterable(this); } @NotNull public Iterable<Tree.Element<T>> nextElementsIterable() { return Tree.Element.DefaultImpls.nextElementsIterable(this); } public T getData() { return this.data; } public int getDepth() { return this.depth; } public int getChildIndex() { return this.childIndex; } public Leaf(Object data, int depth, int childIndex, @Nullable Tree.Element<T> parent, @Nullable Tree.Element<T> previous, @Nullable Tree.Element<T> next, @NotNull Object id) { this.data = (T)data;
/*  61 */       this.depth = depth;
/*  62 */       this.childIndex = childIndex;
/*  63 */       this.parent = parent;
/*  64 */       this.previous = previous;
/*  65 */       this.next = next;
/*  66 */       this.id = id; } @Nullable public Tree.Element<T> getParent() { return this.parent; } @Nullable public Tree.Element<T> getPrevious() { return this.previous; } public void setPrevious(@Nullable Tree.Element<T> <set-?>) { this.previous = <set-?>; } @Nullable public Tree.Element<T> getNext() { return this.next; } public void setNext(@Nullable Tree.Element<T> <set-?>) { this.next = <set-?>; } @NotNull public Object getId() { return this.id; } } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\b\003\n\002\020\000\n\002\b\025\n\002\020\002\n\002\b\004\n\002\020\013\n\002\b\003\b\007\030\000*\004\b\002\020\0012\b\022\004\022\002H\0010\002B\001\022\006\020\003\032\0028\002\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\016\020\007\032\n\022\004\022\0028\002\030\0010\002\0223\020\b\032/\022\031\022\027\022\004\022\0028\0020\000¢\006\f\b\n\022\b\b\013\022\004\b\b(\007\022\020\022\016\022\n\022\b\022\004\022\0028\0020\0020\f0\t\022\016\020\r\032\n\022\004\022\0028\002\030\0010\002\022\016\020\016\032\n\022\004\022\0028\002\030\0010\002\022\006\020\017\032\0020\020¢\006\004\b\021\020\022J\b\020%\032\0020&H\002J\b\020'\032\0020&H\002J\b\020(\032\0020&H\002J\020\020)\032\0020&2\b\b\002\020*\032\0020+J\006\020,\032\0020&J\b\020-\032\0020&H\002R\026\020\003\032\0028\002X\004¢\006\n\n\002\020\025\032\004\b\023\020\024R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\026\020\027R\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b\030\020\027R\034\020\007\032\n\022\004\022\0028\002\030\0010\002X\004¢\006\b\n\000\032\004\b\031\020\032R;\020\b\032/\022\031\022\027\022\004\022\0028\0020\000¢\006\f\b\n\022\b\b\013\022\004\b\b(\007\022\020\022\016\022\n\022\b\022\004\022\0028\0020\0020\f0\tX\004¢\006\002\n\000R\"\020\r\032\n\022\004\022\0028\002\030\0010\002X\016¢\006\016\n\000\032\004\b\033\020\032\"\004\b\034\020\035R\"\020\016\032\n\022\004\022\0028\002\030\0010\002X\016¢\006\016\n\000\032\004\b\036\020\032\"\004\b\037\020\035R\024\020\017\032\0020\020X\004¢\006\b\n\000\032\004\b \020\024R:\020\"\032\020\022\n\022\b\022\004\022\0028\0020\002\030\0010\f2\024\020!\032\020\022\n\022\b\022\004\022\0028\0020\002\030\0010\f@BX\016¢\006\b\n\000\032\004\b#\020$¨\006."}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;", "T", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "data", "depth", "", "childIndex", "parent", "childrenGenerator", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "next", "previous", "id", "", "<init>", "(Ljava/lang/Object;IILorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getDepth", "()I", "getChildIndex", "getParent", "()Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "getNext", "setNext", "(Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;)V", "getPrevious", "setPrevious", "getId", "value", "children", "getChildren", "()Ljava/util/List;", "evaluateChildren", "", "connectChildren", "detachChildren", "open", "reloadChildren", "", "close", "closeRecursively", "foundation"}) @StabilityInferred(parameters = 0) @SourceDebugExtension({"SMAP\nTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tree.kt\norg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n473#2:132\n1313#2,2:133\n1855#3,2:135\n*S KotlinDebug\n*F\n+ 1 Tree.kt\norg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node\n*L\n113#1:132\n113#1:133,2\n117#1:135,2\n*E\n"}) public static final class Node<T> implements Element<T> { private final T data; private final int depth; private final int childIndex; @Nullable private final Tree.Element<T> parent; @NotNull private final Function1<Node<T>, List<Tree.Element<T>>> childrenGenerator; @Nullable
/*     */     private Tree.Element<T> next; @Nullable
/*     */     private Tree.Element<T> previous; @NotNull
/*     */     private final Object id; @Nullable
/*  70 */     private List<? extends Tree.Element<T>> children; public static final int $stable = 8; public Node(Object data, int depth, int childIndex, @Nullable Tree.Element<T> parent, @NotNull Function1<Node<T>, List<Tree.Element<T>>> childrenGenerator, @Nullable Tree.Element<T> next, @Nullable Tree.Element<T> previous, @NotNull Object id) { this.data = (T)data;
/*  71 */       this.depth = depth;
/*  72 */       this.childIndex = childIndex;
/*  73 */       this.parent = parent;
/*  74 */       this.childrenGenerator = childrenGenerator;
/*  75 */       this.next = next;
/*  76 */       this.previous = previous;
/*  77 */       this.id = id; } @NotNull public List<Tree.Element<T>> path() { return Tree.Element.DefaultImpls.path(this); } @NotNull public Iterable<Tree.Element<T>> previousElementsIterable() { return Tree.Element.DefaultImpls.previousElementsIterable(this); } @NotNull public Iterable<Tree.Element<T>> nextElementsIterable() { return Tree.Element.DefaultImpls.nextElementsIterable(this); } public T getData() { return this.data; } public int getDepth() { return this.depth; } public int getChildIndex() { return this.childIndex; } @Nullable public Tree.Element<T> getParent() { return this.parent; } @Nullable public Tree.Element<T> getNext() { return this.next; } public void setNext(@Nullable Tree.Element<T> <set-?>) { this.next = <set-?>; } @Nullable public Tree.Element<T> getPrevious() { return this.previous; } public void setPrevious(@Nullable Tree.Element<T> <set-?>) { this.previous = <set-?>; } @NotNull public Object getId() { return this.id; } @Nullable
/*     */     public final List<Tree.Element<T>> getChildren() {
/*  79 */       return (List)this.children;
/*     */     }
/*     */     
/*     */     private final void evaluateChildren() {
/*  83 */       this.children = (List<? extends Tree.Element<T>>)this.childrenGenerator.invoke(this);
/*     */     }
/*     */     private final void connectChildren() {
/*     */       List<? extends Tree.Element<T>> children;
/*  87 */       if (this.children == null)
/*  88 */         return;  if (!children.isEmpty()) {
/*  89 */         Tree.Element<T> element1 = getNext(), it = element1; int $i$a$-also-Tree$Element$Node$connectChildren$1 = 0;
/*  90 */         it.setPrevious((Tree.Element<T>)CollectionsKt.last(children));
/*  91 */         ((Tree.Element<T>)CollectionsKt.last(children)).setNext(it);
/*     */         getNext();
/*  93 */         setNext((Tree.Element<T>)CollectionsKt.first(children));
/*  94 */         ((Tree.Element)CollectionsKt.first(children)).setPrevious(this);
/*     */       } 
/*     */     }
/*     */     private final void detachChildren() {
/*     */       List<? extends Tree.Element<T>> children;
/*  99 */       if (this.children == null)
/* 100 */         return;  if (!children.isEmpty()) {
/* 101 */         setNext(((Tree.Element<T>)CollectionsKt.last(children)).getNext());
/* 102 */         if (getNext() != null) { getNext().setPrevious(this); } else { getNext(); }
/*     */       
/*     */       } 
/*     */     }
/*     */     public final void open(boolean reloadChildren) {
/* 107 */       if (reloadChildren || this.children == null) evaluateChildren(); 
/* 108 */       connectChildren();
/*     */     }
/*     */     
/*     */     public final void close() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokespecial detachChildren : ()V
/*     */       //   4: aload_0
/*     */       //   5: getfield children : Ljava/util/List;
/*     */       //   8: dup
/*     */       //   9: ifnull -> 95
/*     */       //   12: checkcast java/lang/Iterable
/*     */       //   15: invokestatic asSequence : (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
/*     */       //   18: dup
/*     */       //   19: ifnull -> 95
/*     */       //   22: astore_1
/*     */       //   23: iconst_0
/*     */       //   24: istore_2
/*     */       //   25: aload_1
/*     */       //   26: getstatic org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node$close$$inlined$filterIsInstance$1.INSTANCE : Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node$close$$inlined$filterIsInstance$1;
/*     */       //   29: checkcast kotlin/jvm/functions/Function1
/*     */       //   32: invokestatic filter : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */       //   35: dup
/*     */       //   36: ldc 'null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>'
/*     */       //   38: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   41: dup
/*     */       //   42: ifnull -> 95
/*     */       //   45: astore_1
/*     */       //   46: iconst_0
/*     */       //   47: istore_2
/*     */       //   48: aload_1
/*     */       //   49: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   54: astore_3
/*     */       //   55: aload_3
/*     */       //   56: invokeinterface hasNext : ()Z
/*     */       //   61: ifeq -> 91
/*     */       //   64: aload_3
/*     */       //   65: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   70: astore #4
/*     */       //   72: aload #4
/*     */       //   74: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */       //   77: astore #5
/*     */       //   79: iconst_0
/*     */       //   80: istore #6
/*     */       //   82: aload #5
/*     */       //   84: invokespecial closeRecursively : ()V
/*     */       //   87: nop
/*     */       //   88: goto -> 55
/*     */       //   91: nop
/*     */       //   92: goto -> 97
/*     */       //   95: pop
/*     */       //   96: nop
/*     */       //   97: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #112	-> 0
/*     */       //   #113	-> 4
/*     */       //   #132	-> 25
/*     */       //   #113	-> 41
/*     */       //   #133	-> 48
/*     */       //   #113	-> 82
/*     */       //   #133	-> 87
/*     */       //   #134	-> 91
/*     */       //   #113	-> 95
/*     */       //   #114	-> 97
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   25	16	2	$i$f$filterIsInstance	I
/*     */       //   23	18	1	$this$filterIsInstance$iv	Lkotlin/sequences/Sequence;
/*     */       //   82	5	6	$i$a$-forEach-Tree$Element$Node$close$1	I
/*     */       //   79	8	5	it	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;
/*     */       //   72	16	4	element$iv	Ljava/lang/Object;
/*     */       //   48	44	2	$i$f$forEach	I
/*     */       //   46	46	1	$this$forEach$iv	Lkotlin/sequences/Sequence;
/*     */       //   0	98	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;
/*     */     }
/*     */     
/*     */     private final void closeRecursively() {
/*     */       Iterator<? extends Tree.Element<T>> iterator;
/* 117 */       if (this.children != null) { Iterable<? extends Tree.Element<T>> $this$forEach$iv = this.children; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 135 */         iterator = $this$forEach$iv.iterator(); } else { return; }  if (iterator.hasNext()) { Object<T> element$iv = (Object<T>)iterator.next(); Tree.Element it = (Tree.Element)element$iv; int $i$a$-forEach-Tree$Element$Node$closeRecursively$1 = 0;
/*     */         if (it instanceof Node)
/*     */           ((Node)it).closeRecursively();  }
/*     */     
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\Tree$Element.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */