/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterProviderScope;
/*    */ import org.jetbrains.jewel.ui.painter.PainterSuffixHint;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\030\002\n\000\n\002\020\013\n\002\b\002\bÃ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\0020\005*\0020\006H\026J\f\020\007\032\0020\b*\0020\006H\026J\b\020\t\032\0020\005H\026¨\006\n"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/hints/DarkImpl;", "Lorg/jetbrains/jewel/ui/painter/PainterSuffixHint;", "<init>", "()V", "suffix", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "canApply", "", "toString", "ui"})
/*    */ @Immutable
/*    */ @SourceDebugExtension({"SMAP\nDarkAndStroke.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkAndStroke.kt\norg/jetbrains/jewel/ui/painter/hints/DarkImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1726#2,3:103\n*S KotlinDebug\n*F\n+ 1 DarkAndStroke.kt\norg/jetbrains/jewel/ui/painter/hints/DarkImpl\n*L\n17#1:103,3\n*E\n"})
/*    */ final class DarkImpl extends PainterSuffixHint {
/*    */   @NotNull
/* 15 */   public String suffix(@NotNull PainterProviderScope $this$suffix) { Intrinsics.checkNotNullParameter($this$suffix, "<this>"); return "_dark"; }
/*    */   @NotNull
/*    */   public static final DarkImpl INSTANCE = new DarkImpl(); public boolean canApply(@NotNull PainterProviderScope $this$canApply) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc '<this>'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: invokeinterface getAcceptedHints : ()Ljava/util/List;
/*    */     //   12: checkcast java/lang/Iterable
/*    */     //   15: astore_2
/*    */     //   16: iconst_0
/*    */     //   17: istore_3
/*    */     //   18: aload_2
/*    */     //   19: instanceof java/util/Collection
/*    */     //   22: ifeq -> 41
/*    */     //   25: aload_2
/*    */     //   26: checkcast java/util/Collection
/*    */     //   29: invokeinterface isEmpty : ()Z
/*    */     //   34: ifeq -> 41
/*    */     //   37: iconst_1
/*    */     //   38: goto -> 99
/*    */     //   41: aload_2
/*    */     //   42: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   47: astore #4
/*    */     //   49: aload #4
/*    */     //   51: invokeinterface hasNext : ()Z
/*    */     //   56: ifeq -> 98
/*    */     //   59: aload #4
/*    */     //   61: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   66: astore #5
/*    */     //   68: aload #5
/*    */     //   70: checkcast org/jetbrains/jewel/ui/painter/PainterHint
/*    */     //   73: astore #6
/*    */     //   75: iconst_0
/*    */     //   76: istore #7
/*    */     //   78: aload #6
/*    */     //   80: instanceof org/jetbrains/jewel/ui/painter/hints/StrokeImpl
/*    */     //   83: ifne -> 90
/*    */     //   86: iconst_1
/*    */     //   87: goto -> 91
/*    */     //   90: iconst_0
/*    */     //   91: ifne -> 49
/*    */     //   94: iconst_0
/*    */     //   95: goto -> 99
/*    */     //   98: iconst_1
/*    */     //   99: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 6
/*    */     //   #103	-> 18
/*    */     //   #104	-> 41
/*    */     //   #17	-> 78
/*    */     //   #104	-> 91
/*    */     //   #105	-> 98
/*    */     //   #17	-> 99
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   78	13	7	$i$a$-all-DarkImpl$canApply$1	I
/*    */     //   75	16	6	it	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*    */     //   68	30	5	element$iv	Ljava/lang/Object;
/*    */     //   18	81	3	$i$f$all	I
/*    */     //   16	83	2	$this$all$iv	Ljava/lang/Iterable;
/*    */     //   0	100	0	this	Lorg/jetbrains/jewel/ui/painter/hints/DarkImpl;
/*    */     //   0	100	1	$this$canApply	Lorg/jetbrains/jewel/ui/painter/PainterProviderScope; } @NotNull
/*    */   public String toString() {
/* 19 */     return "Dark";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\DarkImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */