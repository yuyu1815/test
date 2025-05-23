/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.annotation.RestrictTo;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.enums.EnumEntriesKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.markers.KMappedMarker;
/*     */ import kotlin.ranges.ClosedFloatingPointRange;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\007\n\002\b\005\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020!\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020(\n\002\b\n\b\007\030\000*\004\b\000\020\0012\0020\002:\002)*B\005¢\006\002\020\003J%\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\r2\b\020\017\032\004\030\0018\000¢\006\002\020\020J\006\020\021\032\0020\013J\021\020\022\032\0020\0232\006\020\024\032\0020\rH\002J\027\020\022\032\0020\0232\f\020\025\032\b\022\004\022\0020\r0\026H\002J\036\020\027\032\b\022\004\022\0028\0000\0302\006\020\f\032\0020\r2\b\b\002\020\016\032\0020\rJ\032\020\027\032\b\022\004\022\0028\0000\0302\f\020\025\032\b\022\004\022\0020\r0\026J:\020\031\032\016\022\n\022\b\022\004\022\0028\0000\0300\0322\006\020\f\032\0020\r2\b\b\002\020\016\032\0020\r2\024\b\002\020\033\032\016\022\n\022\b\022\004\022\0028\0000\0300\032J6\020\031\032\016\022\n\022\b\022\004\022\0028\0000\0300\0322\f\020\025\032\b\022\004\022\0020\r0\0262\024\b\002\020\033\032\016\022\n\022\b\022\004\022\0028\0000\0300\032J=\020\034\032\0020\0132\006\020\f\032\0020\r2\b\b\002\020\016\032\0020\r2\030\020\035\032\024\022\n\022\b\022\004\022\0028\0000\030\022\004\022\0020\0130\036H\bø\001\000¢\006\002\b\037J9\020\034\032\0020\0132\f\020\025\032\b\022\004\022\0020\r0\0262\030\020\035\032\024\022\n\022\b\022\004\022\0028\0000\030\022\004\022\0020\0130\036H\bø\001\000¢\006\002\b\037J\025\020 \032\016\022\n\022\b\022\004\022\0028\0000\0300!H\002J\027\020\"\032\0020\0132\f\020\025\032\b\022\004\022\0028\0000\030H\002J\032\020#\032\0020\0132\020\020$\032\f0\005R\b\022\004\022\0028\0000\000H\002J\032\020%\032\0020\0132\020\020&\032\f0\005R\b\022\004\022\0028\0000\000H\002J\032\020'\032\0020\0132\020\020&\032\f0\005R\b\022\004\022\0028\0000\000H\002J\032\020(\032\0020\0132\020\020&\032\f0\005R\b\022\004\022\0028\0000\000H\002R\030\020\004\032\f0\005R\b\022\004\022\0028\0000\000X\016¢\006\002\n\000R2\020\006\032&\022\016\022\f0\005R\b\022\004\022\0028\0000\0000\007j\022\022\016\022\f0\005R\b\022\004\022\0028\0000\000`\bX\004¢\006\002\n\000R\030\020\t\032\f0\005R\b\022\004\022\0028\0000\000X\004¢\006\002\n\000\002\007\n\005\b20\001¨\006+"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree;", "T", "", "()V", "root", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "stack", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "terminator", "addInterval", "", "start", "", "end", "data", "(FFLjava/lang/Object;)V", "clear", "contains", "", "value", "interval", "Lkotlin/ranges/ClosedFloatingPointRange;", "findFirstOverlap", "Landroidx/compose/ui/graphics/Interval;", "findOverlaps", "", "results", "forEach", "block", "Lkotlin/Function1;", "forEach$ui_graphics", "iterator", "", "plusAssign", "rebalance", "target", "rotateLeft", "node", "rotateRight", "updateNodeData", "Node", "TreeColor", "ui-graphics"})
/*     */ @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/*     */ @SourceDebugExtension({"SMAP\nIntervalTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,408:1\n171#1,16:409\n171#1,16:425\n171#1,16:441\n*S KotlinDebug\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n121#1:409,16\n148#1:425,16\n160#1:441,16\n*E\n"})
/*     */ public final class IntervalTree<T>
/*     */ {
/*     */   @NotNull
/*  92 */   private final Node terminator = new Node(Float.MAX_VALUE, Float.MIN_VALUE, null, TreeColor.Black); @NotNull
/*  93 */   private Node root = this.terminator; @NotNull
/*  94 */   private final ArrayList<Node> stack = new ArrayList<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void clear() {
/* 101 */     this.root = this.terminator;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Interval<T> findFirstOverlap(@NotNull ClosedFloatingPointRange interval) {
/* 109 */     Intrinsics.checkNotNullParameter(interval, "interval"); return findFirstOverlap(((Number)interval.getStart()).floatValue(), ((Number)interval.getEndInclusive()).floatValue());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Interval<T> findFirstOverlap(float start, float end)
/*     */   {
/* 120 */     if (this.root != this.terminator) {
/* 121 */       IntervalTree this_$iv = this; int $i$f$forEach$ui_graphics = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 409 */       if (this_$iv.root != this_$iv.terminator) {
/* 410 */         ArrayList<Node> s$iv = access$getStack$p(this_$iv);
/* 411 */         s$iv.add(this_$iv.root);
/* 412 */         while (s$iv.size() > 0) {
/* 413 */           Node<T> node$iv = (Node)CollectionsKt.removeLast(s$iv);
/* 414 */           if (node$iv.overlaps(start, end)) { Interval<T> interval = node$iv; int $i$a$-forEach$ui_graphics-IntervalTree$findFirstOverlap$1 = 0; return interval; }
/* 415 */            if (node$iv.getLeft() != this_$iv.terminator && node$iv.getLeft().getMax() >= start) {
/* 416 */             s$iv.add(node$iv.getLeft());
/*     */           }
/* 418 */           if (node$iv.getRight() != this_$iv.terminator && node$iv.getRight().getMin() <= end) {
/* 419 */             s$iv.add(node$iv.getRight());
/*     */           }
/*     */         } 
/* 422 */         s$iv.clear();
/*     */       } 
/*     */     } 
/*     */     Intrinsics.checkNotNull(IntervalTreeKt.getEmptyInterval(), "null cannot be cast to non-null type androidx.compose.ui.graphics.Interval<T of androidx.compose.ui.graphics.IntervalTree>");
/*     */     return (Interval)IntervalTreeKt.getEmptyInterval();
/*     */   }
/*     */   @NotNull
/*     */   public final List<Interval<T>> findOverlaps(@NotNull ClosedFloatingPointRange interval, @NotNull List<Interval<T>> results) {
/*     */     Intrinsics.checkNotNullParameter(interval, "interval");
/*     */     Intrinsics.checkNotNullParameter(results, "results");
/*     */     return findOverlaps(((Number)interval.getStart()).floatValue(), ((Number)interval.getEndInclusive()).floatValue(), results);
/*     */   }
/*     */   public final void forEach$ui_graphics(@NotNull ClosedFloatingPointRange interval, @NotNull Function1 block) {
/*     */     Intrinsics.checkNotNullParameter(interval, "interval");
/*     */     Intrinsics.checkNotNullParameter(block, "block");
/*     */     int $i$f$forEach$ui_graphics = 0;
/*     */     IntervalTree intervalTree = this;
/*     */     float f1 = ((Number)interval.getStart()).floatValue(), end$iv = ((Number)interval.getEndInclusive()).floatValue();
/*     */     int i = 0;
/* 441 */     if (intervalTree.root != intervalTree.terminator) {
/* 442 */       ArrayList<Node> s$iv = access$getStack$p(intervalTree);
/* 443 */       s$iv.add(intervalTree.root);
/* 444 */       while (s$iv.size() > 0) {
/* 445 */         Node node$iv = (Node)CollectionsKt.removeLast(s$iv);
/* 446 */         if (node$iv.overlaps(f1, end$iv)) block.invoke(node$iv); 
/* 447 */         if (node$iv.getLeft() != intervalTree.terminator && node$iv.getLeft().getMax() >= f1) {
/* 448 */           s$iv.add(node$iv.getLeft());
/*     */         }
/* 450 */         if (node$iv.getRight() != intervalTree.terminator && node$iv.getRight().getMin() <= end$iv) {
/* 451 */           s$iv.add(node$iv.getRight());
/*     */         }
/*     */       } 
/* 454 */       s$iv.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Interval<T>> findOverlaps(float start, float end, @NotNull List<Object> results) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc 'results'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: astore #4
/*     */     //   9: iconst_0
/*     */     //   10: istore #5
/*     */     //   12: aload #4
/*     */     //   14: invokestatic access$getRoot$p : (Landroidx/compose/ui/graphics/IntervalTree;)Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   17: aload #4
/*     */     //   19: invokestatic access$getTerminator$p : (Landroidx/compose/ui/graphics/IntervalTree;)Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   22: if_acmpeq -> 177
/*     */     //   25: aload #4
/*     */     //   27: invokestatic access$getStack$p : (Landroidx/compose/ui/graphics/IntervalTree;)Ljava/util/ArrayList;
/*     */     //   30: astore #6
/*     */     //   32: aload #6
/*     */     //   34: aload #4
/*     */     //   36: invokestatic access$getRoot$p : (Landroidx/compose/ui/graphics/IntervalTree;)Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   39: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   42: pop
/*     */     //   43: aload #6
/*     */     //   45: invokevirtual size : ()I
/*     */     //   48: ifle -> 172
/*     */     //   51: aload #6
/*     */     //   53: checkcast java/util/List
/*     */     //   56: invokestatic removeLast : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   59: checkcast androidx/compose/ui/graphics/IntervalTree$Node
/*     */     //   62: astore #7
/*     */     //   64: aload #7
/*     */     //   66: fload_1
/*     */     //   67: fload_2
/*     */     //   68: invokevirtual overlaps : (FF)Z
/*     */     //   71: ifeq -> 95
/*     */     //   74: aload #7
/*     */     //   76: checkcast androidx/compose/ui/graphics/Interval
/*     */     //   79: astore #8
/*     */     //   81: iconst_0
/*     */     //   82: istore #9
/*     */     //   84: aload_3
/*     */     //   85: aload #8
/*     */     //   87: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   92: pop
/*     */     //   93: nop
/*     */     //   94: nop
/*     */     //   95: aload #7
/*     */     //   97: invokevirtual getLeft : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   100: aload #4
/*     */     //   102: invokestatic access$getTerminator$p : (Landroidx/compose/ui/graphics/IntervalTree;)Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   105: if_acmpeq -> 132
/*     */     //   108: aload #7
/*     */     //   110: invokevirtual getLeft : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   113: invokevirtual getMax : ()F
/*     */     //   116: fload_1
/*     */     //   117: fcmpl
/*     */     //   118: iflt -> 132
/*     */     //   121: aload #6
/*     */     //   123: aload #7
/*     */     //   125: invokevirtual getLeft : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   128: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   131: pop
/*     */     //   132: aload #7
/*     */     //   134: invokevirtual getRight : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   137: aload #4
/*     */     //   139: invokestatic access$getTerminator$p : (Landroidx/compose/ui/graphics/IntervalTree;)Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   142: if_acmpeq -> 43
/*     */     //   145: aload #7
/*     */     //   147: invokevirtual getRight : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   150: invokevirtual getMin : ()F
/*     */     //   153: fload_2
/*     */     //   154: fcmpg
/*     */     //   155: ifgt -> 43
/*     */     //   158: aload #6
/*     */     //   160: aload #7
/*     */     //   162: invokevirtual getRight : ()Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   165: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   168: pop
/*     */     //   169: goto -> 43
/*     */     //   172: aload #6
/*     */     //   174: invokevirtual clear : ()V
/*     */     //   177: nop
/*     */     //   178: aload_3
/*     */     //   179: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #148	-> 6
/*     */     //   #425	-> 12
/*     */     //   #426	-> 25
/*     */     //   #427	-> 32
/*     */     //   #428	-> 43
/*     */     //   #429	-> 51
/*     */     //   #430	-> 64
/*     */     //   #149	-> 84
/*     */     //   #150	-> 93
/*     */     //   #430	-> 94
/*     */     //   #431	-> 95
/*     */     //   #432	-> 121
/*     */     //   #434	-> 132
/*     */     //   #435	-> 158
/*     */     //   #438	-> 172
/*     */     //   #440	-> 177
/*     */     //   #151	-> 178
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   84	10	9	$i$a$-forEach$ui_graphics-IntervalTree$findOverlaps$1	I
/*     */     //   81	13	8	interval	Landroidx/compose/ui/graphics/Interval;
/*     */     //   64	105	7	node$iv	Landroidx/compose/ui/graphics/IntervalTree$Node;
/*     */     //   32	145	6	s$iv	Ljava/util/ArrayList;
/*     */     //   12	166	5	$i$f$forEach$ui_graphics	I
/*     */     //   9	169	4	this_$iv	Landroidx/compose/ui/graphics/IntervalTree;
/*     */     //   0	180	0	this	Landroidx/compose/ui/graphics/IntervalTree;
/*     */     //   0	180	1	start	F
/*     */     //   0	180	2	end	F
/*     */     //   0	180	3	results	Ljava/util/List;
/*     */   }
/*     */   
/*     */   public final void forEach$ui_graphics(float start, float end, @NotNull Function1 block) {
/*     */     Intrinsics.checkNotNullParameter(block, "block");
/*     */     int $i$f$forEach$ui_graphics = 0;
/*     */     if (this.root != this.terminator) {
/*     */       ArrayList<Node> s = access$getStack$p(this);
/*     */       s.add(this.root);
/*     */       while (s.size() > 0) {
/*     */         Node node = (Node)CollectionsKt.removeLast(s);
/*     */         if (node.overlaps(start, end))
/*     */           block.invoke(node); 
/*     */         if (node.getLeft() != this.terminator && node.getLeft().getMax() >= start)
/*     */           s.add(node.getLeft()); 
/*     */         if (node.getRight() != this.terminator && node.getRight().getMin() <= end)
/*     */           s.add(node.getRight()); 
/*     */       } 
/*     */       s.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   public final boolean contains(float value) {
/*     */     return (findFirstOverlap(value, value) != IntervalTreeKt.getEmptyInterval());
/*     */   }
/*     */   
/*     */   public final boolean contains(@NotNull ClosedFloatingPointRange interval) {
/*     */     Intrinsics.checkNotNullParameter(interval, "interval");
/*     */     return (findFirstOverlap(((Number)interval.getStart()).floatValue(), ((Number)interval.getEndInclusive()).floatValue()) != IntervalTreeKt.getEmptyInterval());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Iterator<Interval<T>> iterator() {
/*     */     return new IntervalTree$iterator$1();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\020(\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\016\022\n\022\b\022\004\022\0028\0000\0020\001J\t\020\n\032\0020\013H\002J\017\020\f\032\b\022\004\022\0028\0000\002H\002R$\020\003\032\f0\004R\b\022\004\022\0028\0000\005X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\t¨\006\r"}, d2 = {"androidx/compose/ui/graphics/IntervalTree$iterator$1", "", "Landroidx/compose/ui/graphics/Interval;", "_next", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/IntervalTree;", "get_next", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "set_next", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "hasNext", "", "next", "ui-graphics"})
/*     */   public static final class IntervalTree$iterator$1 implements Iterator<Interval<T>>, KMappedMarker {
/*     */     @NotNull
/*     */     private IntervalTree<T>.Node _next;
/*     */     
/*     */     IntervalTree$iterator$1() {
/*     */       this._next = $receiver.root.lowestNode();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final IntervalTree<T>.Node get_next() {
/*     */       return this._next;
/*     */     }
/*     */     
/*     */     public final void set_next(@NotNull IntervalTree.Node <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this._next = <set-?>;
/*     */     }
/*     */     
/*     */     public boolean hasNext() {
/*     */       return (this._next != IntervalTree.this.terminator);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Interval<T> next() {
/*     */       IntervalTree.Node node = this._next;
/*     */       this._next = this._next.next();
/*     */       return node;
/*     */     }
/*     */     
/*     */     public void remove() {
/*     */       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
/*     */     }
/*     */   }
/*     */   
/*     */   public final void plusAssign(@NotNull Interval<T> interval) {
/*     */     Intrinsics.checkNotNullParameter(interval, "interval");
/*     */     addInterval(interval.getStart(), interval.getEnd(), interval.getData());
/*     */   }
/*     */   
/*     */   public final void addInterval(float start, float end, @Nullable Object data) {
/*     */     Node node = new Node(start, end, (T)data, TreeColor.Red);
/*     */     Node current = this.root;
/*     */     Node parent = this.terminator;
/*     */     while (current != this.terminator) {
/*     */       parent = current;
/*     */       current = (node.getStart() <= current.getStart()) ? current.getLeft() : current.getRight();
/*     */     } 
/*     */     node.setParent(parent);
/*     */     if (parent == this.terminator) {
/*     */       this.root = node;
/*     */     } else if (node.getStart() <= parent.getStart()) {
/*     */       parent.setLeft(node);
/*     */     } else {
/*     */       parent.setRight(node);
/*     */     } 
/*     */     updateNodeData(node);
/*     */     rebalance(node);
/*     */   }
/*     */   
/*     */   private final void rebalance(Node target) {
/*     */     Node node = target;
/*     */     while (node != this.root && node.getParent().getColor() == TreeColor.Red) {
/*     */       Node ancestor = node.getParent().getParent();
/*     */       if (node.getParent() == ancestor.getLeft()) {
/*     */         Node right = ancestor.getRight();
/*     */         if (right.getColor() == TreeColor.Red) {
/*     */           right.setColor(TreeColor.Black);
/*     */           node.getParent().setColor(TreeColor.Black);
/*     */           ancestor.setColor(TreeColor.Red);
/*     */           node = ancestor;
/*     */           continue;
/*     */         } 
/*     */         if (node == node.getParent().getRight()) {
/*     */           node = node.getParent();
/*     */           rotateLeft(node);
/*     */         } 
/*     */         node.getParent().setColor(TreeColor.Black);
/*     */         ancestor.setColor(TreeColor.Red);
/*     */         rotateRight(ancestor);
/*     */         continue;
/*     */       } 
/*     */       Node left = ancestor.getLeft();
/*     */       if (left.getColor() == TreeColor.Red) {
/*     */         left.setColor(TreeColor.Black);
/*     */         node.getParent().setColor(TreeColor.Black);
/*     */         ancestor.setColor(TreeColor.Red);
/*     */         node = ancestor;
/*     */         continue;
/*     */       } 
/*     */       if (node == node.getParent().getLeft()) {
/*     */         node = node.getParent();
/*     */         rotateRight(node);
/*     */       } 
/*     */       node.getParent().setColor(TreeColor.Black);
/*     */       ancestor.setColor(TreeColor.Red);
/*     */       rotateLeft(ancestor);
/*     */     } 
/*     */     this.root.setColor(TreeColor.Black);
/*     */   }
/*     */   
/*     */   private final void rotateLeft(Node node) {
/*     */     Node right = node.getRight();
/*     */     node.setRight(right.getLeft());
/*     */     if (right.getLeft() != this.terminator)
/*     */       right.getLeft().setParent(node); 
/*     */     right.setParent(node.getParent());
/*     */     if (node.getParent() == this.terminator) {
/*     */       this.root = right;
/*     */     } else if (node.getParent().getLeft() == node) {
/*     */       node.getParent().setLeft(right);
/*     */     } else {
/*     */       node.getParent().setRight(right);
/*     */     } 
/*     */     right.setLeft(node);
/*     */     node.setParent(right);
/*     */     updateNodeData(node);
/*     */   }
/*     */   
/*     */   private final void rotateRight(Node node) {
/*     */     Node left = node.getLeft();
/*     */     node.setLeft(left.getRight());
/*     */     if (left.getRight() != this.terminator)
/*     */       left.getRight().setParent(node); 
/*     */     left.setParent(node.getParent());
/*     */     if (node.getParent() == this.terminator) {
/*     */       this.root = left;
/*     */     } else if (node.getParent().getRight() == node) {
/*     */       node.getParent().setRight(left);
/*     */     } else {
/*     */       node.getParent().setLeft(left);
/*     */     } 
/*     */     left.setRight(node);
/*     */     node.setParent(left);
/*     */     updateNodeData(node);
/*     */   }
/*     */   
/*     */   private final void updateNodeData(Node node) {
/*     */     Node current = node;
/*     */     while (current != this.terminator) {
/*     */       current.setMin(Math.min(current.getStart(), Math.min(current.getLeft().getMin(), current.getRight().getMin())));
/*     */       current.setMax(Math.max(current.getEnd(), Math.max(current.getLeft().getMax(), current.getRight().getMax())));
/*     */       current = current.getParent();
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$TreeColor;", "", "(Ljava/lang/String;I)V", "Red", "Black", "ui-graphics"})
/*     */   public enum TreeColor {
/*     */     Red, Black;
/*     */     
/*     */     @NotNull
/*     */     public static EnumEntries<TreeColor> getEntries() {
/*     */       return $ENTRIES;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\025\b\004\030\0002\b\022\004\022\0028\0000\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\005\032\004\030\0018\000\022\006\020\006\032\0020\007¢\006\002\020\bJ\020\020!\032\f0\000R\b\022\004\022\0028\0000\016J\020\020\"\032\f0\000R\b\022\004\022\0028\0000\016R\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\fR$\020\r\032\f0\000R\b\022\004\022\0028\0000\016X\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022R\032\020\023\032\0020\003X\016¢\006\016\n\000\032\004\b\024\020\025\"\004\b\026\020\027R\032\020\030\032\0020\003X\016¢\006\016\n\000\032\004\b\031\020\025\"\004\b\032\020\027R$\020\033\032\f0\000R\b\022\004\022\0028\0000\016X\016¢\006\016\n\000\032\004\b\034\020\020\"\004\b\035\020\022R$\020\036\032\f0\000R\b\022\004\022\0028\0000\016X\016¢\006\016\n\000\032\004\b\037\020\020\"\004\b \020\022¨\006#"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/Interval;", "start", "", "end", "data", "color", "Landroidx/compose/ui/graphics/IntervalTree$TreeColor;", "(Landroidx/compose/ui/graphics/IntervalTree;FFLjava/lang/Object;Landroidx/compose/ui/graphics/IntervalTree$TreeColor;)V", "getColor", "()Landroidx/compose/ui/graphics/IntervalTree$TreeColor;", "setColor", "(Landroidx/compose/ui/graphics/IntervalTree$TreeColor;)V", "left", "Landroidx/compose/ui/graphics/IntervalTree;", "getLeft", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "setLeft", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "max", "getMax", "()F", "setMax", "(F)V", "min", "getMin", "setMin", "parent", "getParent", "setParent", "right", "getRight", "setRight", "lowestNode", "next", "ui-graphics"})
/*     */   public final class Node extends Interval<T> {
/*     */     @NotNull
/*     */     private IntervalTree.TreeColor color;
/*     */     private float min;
/*     */     private float max;
/*     */     @NotNull
/*     */     private Node left;
/*     */     @NotNull
/*     */     private Node right;
/*     */     @NotNull
/*     */     private Node parent;
/*     */     
/*     */     public Node(float start, @Nullable float end, @NotNull Object data, IntervalTree.TreeColor color) {
/*     */       super(start, end, (T)data);
/*     */       this.color = color;
/*     */       this.min = start;
/*     */       this.max = end;
/*     */       this.left = IntervalTree.this.terminator;
/*     */       this.right = IntervalTree.this.terminator;
/*     */       this.parent = IntervalTree.this.terminator;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final IntervalTree.TreeColor getColor() {
/*     */       return this.color;
/*     */     }
/*     */     
/*     */     public final void setColor(@NotNull IntervalTree.TreeColor <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.color = <set-?>;
/*     */     }
/*     */     
/*     */     public final float getMin() {
/*     */       return this.min;
/*     */     }
/*     */     
/*     */     public final void setMin(float <set-?>) {
/*     */       this.min = <set-?>;
/*     */     }
/*     */     
/*     */     public final float getMax() {
/*     */       return this.max;
/*     */     }
/*     */     
/*     */     public final void setMax(float <set-?>) {
/*     */       this.max = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Node getLeft() {
/*     */       return this.left;
/*     */     }
/*     */     
/*     */     public final void setLeft(@NotNull Node <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.left = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Node getRight() {
/*     */       return this.right;
/*     */     }
/*     */     
/*     */     public final void setRight(@NotNull Node <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.right = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Node getParent() {
/*     */       return this.parent;
/*     */     }
/*     */     
/*     */     public final void setParent(@NotNull Node <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.parent = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Node lowestNode() {
/*     */       Node node = this;
/*     */       while (node.left != IntervalTree.this.terminator)
/*     */         node = node.left; 
/*     */       return node;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Node next() {
/*     */       if (this.right != IntervalTree.this.terminator)
/*     */         return this.right.lowestNode(); 
/*     */       Node a = this;
/*     */       Node b = this.parent;
/*     */       while (b != IntervalTree.this.terminator && a == b.right) {
/*     */         a = b;
/*     */         b = b.parent;
/*     */       } 
/*     */       return b;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\IntervalTree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */