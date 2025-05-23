/*    */ package ai.grazie.utils.mpp.time;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001J\016\020\t\032\0020\0042\006\020\n\032\0020\013J\016\020\f\032\0020\0042\006\020\r\032\0020\013R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Lai/grazie/utils/mpp/time/TimeInterval$Companion;", "", "()V", "EMPTY", "Lai/grazie/utils/mpp/time/TimeInterval;", "getEMPTY", "()Lai/grazie/utils/mpp/time/TimeInterval;", "serializer", "Lkotlinx/serialization/KSerializer;", "sinceEpoch", "to", "Lai/grazie/utils/mpp/time/Timestamp;", "tillMax", "from", "utils-common"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<TimeInterval> serializer() {
/* 15 */     return (KSerializer<TimeInterval>)TimeInterval.$serializer.INSTANCE; } @NotNull
/* 16 */   public final TimeInterval getEMPTY() { return TimeInterval.access$getEMPTY$cp(); }
/*    */    @NotNull
/*    */   public final TimeInterval sinceEpoch(@NotNull Timestamp to) {
/* 19 */     Intrinsics.checkNotNullParameter(to, "to"); return new TimeInterval(Timestamp.Companion.epoch(), to);
/*    */   } @NotNull
/*    */   public final TimeInterval tillMax(@NotNull Timestamp from) {
/* 22 */     Intrinsics.checkNotNullParameter(from, "from"); return new TimeInterval(from, Timestamp.Companion.max());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\TimeInterval$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */