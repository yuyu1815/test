/*    */ package ai.grazie.utils.mpp.time;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\t\b\001\030\000 \t2\b\022\004\022\0020\0000\001:\001\tB\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\b¨\006\n"}, d2 = {"Lai/grazie/utils/mpp/time/TimePeriod;", "", "(Ljava/lang/String;I)V", "Second", "Minute", "Hour", "Day", "Month", "Year", "Companion", "utils-common"})
/*    */ public enum TimePeriod {
/*  9 */   Second,
/* 10 */   Minute,
/* 11 */   Hour,
/* 12 */   Day,
/* 13 */   Month,
/* 14 */   Year; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final null INSTANCE = (null)new Function0<>();
/*    */     
/*    */     null() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final KSerializer<Object> invoke() {
/*    */       return EnumsKt.createSimpleEnumSerializer("ai.grazie.utils.mpp.time.TimePeriod", (Enum[])TimePeriod.values());
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/mpp/time/TimePeriod$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/mpp/time/TimePeriod;", "utils-common"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TimePeriod> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\TimePeriod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */