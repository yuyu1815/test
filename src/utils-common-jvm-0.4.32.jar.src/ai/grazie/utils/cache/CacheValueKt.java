/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\032 \020\000\032\b\022\004\022\002H\0020\001\"\b\b\000\020\002*\0020\003*\b\022\004\022\002H\0020\004¨\006\005"}, d2 = {"toWrapper", "Lai/grazie/utils/cache/Wrapper;", "Value", "", "Lai/grazie/utils/cache/CacheValue;", "utils-common"})
/*    */ public final class CacheValueKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <Value> Wrapper<Value> toWrapper(@NotNull CacheValue<Value> $this$toWrapper) {
/* 16 */     Intrinsics.checkNotNullParameter($this$toWrapper, "<this>"); return new Wrapper<>($this$toWrapper.getValue());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\CacheValueKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */