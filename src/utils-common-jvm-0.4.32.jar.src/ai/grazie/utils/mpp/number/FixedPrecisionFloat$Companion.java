/*    */ package ai.grazie.utils.mpp.number;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\t\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\013\032\b\022\004\022\0020\b0\fHÆ\001R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\006XT¢\006\002\n\000R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\n¨\006\r"}, d2 = {"Lai/grazie/utils/mpp/number/FixedPrecisionFloat$Companion;", "", "()V", "EXPONENT", "", "PRECISION", "", "ZERO", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "getZERO", "()Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<FixedPrecisionFloat> serializer() {
/* 65 */     return (KSerializer<FixedPrecisionFloat>)FixedPrecisionFloat.Serializer.INSTANCE;
/*    */   }
/*    */   @NotNull
/*    */   public final FixedPrecisionFloat getZERO() {
/* 69 */     return FixedPrecisionFloat.access$getZERO$cp();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\number\FixedPrecisionFloat$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */