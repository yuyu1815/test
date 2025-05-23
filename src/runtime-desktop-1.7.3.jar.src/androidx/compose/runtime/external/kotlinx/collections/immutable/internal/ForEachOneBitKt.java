/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\020\002\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\004\032H\020\000\032\0020\001*\0020\00226\020\003\0322\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\023\022\0210\002¢\006\f\b\005\022\b\b\006\022\004\b\b(\b\022\004\022\0020\0010\004H\bø\001\000\002\007\n\005\b20\001¨\006\t"}, d2 = {"forEachOneBit", "", "", "body", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "mask", "index", "runtime"})
/*    */ public final class ForEachOneBitKt {
/*    */   public static final void forEachOneBit(int $this$forEachOneBit, @NotNull Function2 body) {
/* 10 */     Intrinsics.checkNotNullParameter(body, "body"); int $i$f$forEachOneBit = 0, mask = $this$forEachOneBit;
/* 11 */     int index = 0;
/* 12 */     while (mask != 0) {
/* 13 */       int bit = Integer.lowestOneBit(mask);
/* 14 */       body.invoke(Integer.valueOf(bit), Integer.valueOf(index));
/* 15 */       index++;
/* 16 */       mask ^= bit;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\internal\ForEachOneBitKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */