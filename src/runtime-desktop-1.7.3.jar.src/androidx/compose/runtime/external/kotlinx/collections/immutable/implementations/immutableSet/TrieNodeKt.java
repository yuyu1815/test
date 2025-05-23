/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\b\n\002\b\007\n\002\020\021\n\002\020\000\n\002\b\007\n\002\030\002\n\002\020\013\n\002\b\005\032\030\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020\007\032\0020\001H\000\0327\020\b\032\n\022\006\022\004\030\0010\n0\t\"\004\b\000\020\013*\n\022\006\022\004\030\0010\n0\t2\006\020\006\032\0020\0012\006\020\f\032\002H\013H\002¢\006\002\020\r\032L\020\016\032\0020\001*\n\022\006\022\004\030\0010\n0\t2\016\020\017\032\n\022\006\022\004\030\0010\n0\t2\b\b\002\020\020\032\0020\0012\026\b\002\020\021\032\020\022\006\022\004\030\0010\n\022\004\022\0020\0230\022H\b¢\006\002\020\024\032)\020\025\032\n\022\006\022\004\030\0010\n0\t*\n\022\006\022\004\030\0010\n0\t2\006\020\026\032\0020\001H\002¢\006\002\020\027\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000¨\006\030"}, d2 = {"LOG_MAX_BRANCHING_FACTOR", "", "MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "indexSegment", "index", "shift", "addElementAtIndex", "", "", "E", "element", "([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;", "filterTo", "newArray", "newArrayOffset", "predicate", "Lkotlin/Function1;", "", "([Ljava/lang/Object;[Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)I", "removeCellAtIndex", "cellIndex", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "runtime"})
/*    */ public final class TrieNodeKt
/*    */ {
/*    */   public static final int MAX_BRANCHING_FACTOR = 32;
/*    */   public static final int LOG_MAX_BRANCHING_FACTOR = 5;
/*    */   public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
/*    */   public static final int MAX_SHIFT = 30;
/*    */   
/*    */   public static final int indexSegment(int index, int shift) {
/* 26 */     return index >> shift & 0x1F;
/*    */   }
/*    */   
/*    */   private static final <E> Object[] addElementAtIndex(Object[] $this$addElementAtIndex, int index, Object element) {
/* 30 */     Object[] newBuffer = new Object[$this$addElementAtIndex.length + 1];
/* 31 */     ArraysKt.copyInto$default($this$addElementAtIndex, newBuffer, 0, 0, index, 6, null);
/* 32 */     ArraysKt.copyInto($this$addElementAtIndex, newBuffer, index + 1, index, $this$addElementAtIndex.length);
/* 33 */     newBuffer[index] = element;
/* 34 */     return newBuffer;
/*    */   }
/*    */   
/*    */   private static final Object[] removeCellAtIndex(Object[] $this$removeCellAtIndex, int cellIndex) {
/* 38 */     Object[] newBuffer = new Object[$this$removeCellAtIndex.length - 1];
/* 39 */     ArraysKt.copyInto$default($this$removeCellAtIndex, newBuffer, 0, 0, cellIndex, 6, null);
/* 40 */     ArraysKt.copyInto($this$removeCellAtIndex, newBuffer, cellIndex, cellIndex + 1, $this$removeCellAtIndex.length);
/* 41 */     return newBuffer;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\000\n\002\b\002\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"})
/*    */   @SourceDebugExtension({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n*L\n1#1,851:1\n*E\n"})
/*    */   public static final class TrieNodeKt$filterTo$1
/*    */     extends Lambda
/*    */     implements Function1<Object, Boolean> {
/*    */     public static final TrieNodeKt$filterTo$1 INSTANCE = new TrieNodeKt$filterTo$1();
/*    */     
/*    */     @NotNull
/*    */     public final Boolean invoke(@Nullable Object it) {
/* 53 */       return Boolean.valueOf((it != TrieNode.Companion.getEMPTY$runtime()));
/*    */     }
/*    */     
/*    */     public TrieNodeKt$filterTo$1() {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */   
/*    */   private static final int filterTo(Object[] $this$filterTo, Object[] newArray, int newArrayOffset, Function1 predicate) {
/*    */     // Byte code:
/*    */     //   0: iconst_0
/*    */     //   1: istore #4
/*    */     //   3: iconst_0
/*    */     //   4: istore #5
/*    */     //   6: iconst_0
/*    */     //   7: istore #6
/*    */     //   9: iload #5
/*    */     //   11: aload_0
/*    */     //   12: arraylength
/*    */     //   13: if_icmpge -> 92
/*    */     //   16: iload #6
/*    */     //   18: iload #5
/*    */     //   20: if_icmpgt -> 27
/*    */     //   23: iconst_1
/*    */     //   24: goto -> 28
/*    */     //   27: iconst_0
/*    */     //   28: invokestatic assert : (Z)V
/*    */     //   31: aload_0
/*    */     //   32: iload #5
/*    */     //   34: aaload
/*    */     //   35: astore #7
/*    */     //   37: aload_3
/*    */     //   38: aload #7
/*    */     //   40: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   45: checkcast java/lang/Boolean
/*    */     //   48: invokevirtual booleanValue : ()Z
/*    */     //   51: ifeq -> 85
/*    */     //   54: aload_1
/*    */     //   55: iload_2
/*    */     //   56: iload #6
/*    */     //   58: iadd
/*    */     //   59: aload_0
/*    */     //   60: iload #5
/*    */     //   62: aaload
/*    */     //   63: aastore
/*    */     //   64: iinc #6, 1
/*    */     //   67: nop
/*    */     //   68: iload_2
/*    */     //   69: iload #6
/*    */     //   71: iadd
/*    */     //   72: aload_1
/*    */     //   73: arraylength
/*    */     //   74: if_icmpgt -> 81
/*    */     //   77: iconst_1
/*    */     //   78: goto -> 82
/*    */     //   81: iconst_0
/*    */     //   82: invokestatic assert : (Z)V
/*    */     //   85: iinc #5, 1
/*    */     //   88: nop
/*    */     //   89: goto -> 9
/*    */     //   92: iload #6
/*    */     //   94: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #54	-> 3
/*    */     //   #55	-> 6
/*    */     //   #56	-> 9
/*    */     //   #57	-> 16
/*    */     //   #58	-> 31
/*    */     //   #59	-> 37
/*    */     //   #60	-> 54
/*    */     //   #61	-> 67
/*    */     //   #62	-> 68
/*    */     //   #64	-> 88
/*    */     //   #66	-> 92
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   37	52	7	e	Ljava/lang/Object;
/*    */     //   3	92	4	$i$f$filterTo	I
/*    */     //   6	89	5	i	I
/*    */     //   9	86	6	j	I
/*    */     //   0	95	0	$this$filterTo	[Ljava/lang/Object;
/*    */     //   0	95	1	newArray	[Ljava/lang/Object;
/*    */     //   0	95	2	newArrayOffset	I
/*    */     //   0	95	3	predicate	Lkotlin/jvm/functions/Function1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableSet\TrieNodeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */