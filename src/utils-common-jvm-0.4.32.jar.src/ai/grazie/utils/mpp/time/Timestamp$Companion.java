/*    */ package ai.grazie.utils.mpp.time;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\006\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004J\006\020\005\032\0020\004J\006\020\006\032\0020\004J\016\020\007\032\0020\0042\006\020\b\032\0020\tJ\016\020\n\032\0020\0042\006\020\013\032\0020\fJ\016\020\r\032\0020\0042\006\020\013\032\0020\fJ\017\020\016\032\b\022\004\022\0020\0040\017HÆ\001¨\006\020"}, d2 = {"Lai/grazie/utils/mpp/time/Timestamp$Companion;", "", "()V", "epoch", "Lai/grazie/utils/mpp/time/Timestamp;", "max", "now", "of", "millis", "", "ofFullDate", "value", "", "ofHttpDate", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<Timestamp> serializer() {
/* 20 */     return Timestamp.Serializer.INSTANCE; } @NotNull
/* 21 */   public final Timestamp now() { return new Timestamp(Time.INSTANCE.epochMillis$utils_common()); } @NotNull
/*    */   public final Timestamp epoch() {
/* 23 */     return new Timestamp(0L);
/*    */   } @NotNull
/*    */   public final Timestamp max() {
/* 26 */     return new Timestamp(Long.MAX_VALUE);
/*    */   }
/*    */   @NotNull
/*    */   public final Timestamp ofFullDate(@NotNull String value) {
/* 30 */     Intrinsics.checkNotNullParameter(value, "value"); return TimeUtils.INSTANCE.ofFullDate(value);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp ofHttpDate(@NotNull String value) {
/* 35 */     Intrinsics.checkNotNullParameter(value, "value"); return TimeUtils.INSTANCE.ofHttpDate(value);
/*    */   }
/*    */   @NotNull
/*    */   public final Timestamp of(double millis) {
/* 39 */     return new Timestamp((long)millis);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\Timestamp$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */