/*    */ package ai.grazie.text;
/*    */ 
/*    */ import java.util.NoSuchElementException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.IntRange;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\033\020\003\032\004\030\0010\0042\f\020\005\032\b\022\004\022\0020\0040\006¢\006\002\020\007J\021\020\b\032\0020\0042\006\020\t\032\0020\nH\002J\017\020\013\032\b\022\004\022\0020\0040\fHÆ\001¨\006\r"}, d2 = {"Lai/grazie/text/TextRange$Companion;", "", "()V", "covering", "Lai/grazie/text/TextRange;", "ranges", "", "([Lai/grazie/text/TextRange;)Lai/grazie/text/TextRange;", "invoke", "range", "Lkotlin/ranges/IntRange;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-text"})
/*    */ @SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nai/grazie/text/TextRange$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<TextRange> serializer() {
/* 82 */     return (KSerializer<TextRange>)TextRange.$serializer.INSTANCE; } @NotNull
/*    */   public final TextRange invoke(@NotNull IntRange range) {
/* 84 */     Intrinsics.checkNotNullParameter(range, "range"); return new TextRange(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final TextRange covering(@NotNull TextRange[] ranges) {
/* 92 */     Intrinsics.checkNotNullParameter(ranges, "ranges"); if ((ranges.length == 0)) return null; 
/* 93 */     TextRange[] arrayOfTextRange = ranges; if ((arrayOfTextRange.length == 0)) throw new NoSuchElementException();  TextRange textRange1 = arrayOfTextRange[0];
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 98 */     int $i$a$-minOf-TextRange$Companion$covering$1 = 0; int j = textRange1.getStart(); $i$a$-minOf-TextRange$Companion$covering$1 = 1; int k = ArraysKt.getLastIndex((Object[])arrayOfTextRange); if ($i$a$-minOf-TextRange$Companion$covering$1 <= k) while (true) { TextRange textRange = arrayOfTextRange[$i$a$-minOf-TextRange$Companion$covering$1]; int i4 = 0; int i3 = textRange.getStart(); if (j > i3) j = i3;  if ($i$a$-minOf-TextRange$Companion$covering$1 != k) { $i$a$-minOf-TextRange$Companion$covering$1++; continue; }  break; }   arrayOfTextRange = ranges; int m = j; if ((arrayOfTextRange.length == 0)) throw new NoSuchElementException();  TextRange it = arrayOfTextRange[0]; int $i$a$-maxOf-TextRange$Companion$covering$2 = 0; int i = it.getEndExclusive(); $i$a$-maxOf-TextRange$Companion$covering$2 = 1; k = ArraysKt.getLastIndex((Object[])arrayOfTextRange); if ($i$a$-maxOf-TextRange$Companion$covering$2 <= k) while (true) { TextRange textRange = arrayOfTextRange[$i$a$-maxOf-TextRange$Companion$covering$2]; int i4 = 0;
/*    */         int i3 = textRange.getEndExclusive();
/*    */         if (i < i3)
/*    */           i = i3; 
/*    */         if ($i$a$-maxOf-TextRange$Companion$covering$2 != k) {
/*    */           $i$a$-maxOf-TextRange$Companion$covering$2++;
/*    */           continue;
/*    */         } 
/*    */         break; }
/*    */        
/*    */     int n = i, i1 = n, i2 = m;
/*    */     return new TextRange(i2, i1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-text-jvm-0.4.32.jar!\ai\grazie\text\TextRange$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */