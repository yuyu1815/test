/*    */ package ai.grazie.model.cloud.sse.continuous.events.type;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\020\016\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\013\032\b\022\004\022\0020\0060\fHÆ\001J\020\020\r\032\004\030\0010\0062\006\020\016\032\0020\005R'\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\0048BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\b¨\006\017"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd$Companion;", "", "()V", "values", "", "", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;", "getValues", "()Ljava/util/Map;", "values$delegate", "Lkotlin/Lazy;", "serializer", "Lkotlinx/serialization/KSerializer;", "tryParse", "value", "model-cloud"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<ContinuousSSEPrematureEnd> serializer() {
/* 26 */     return (KSerializer<ContinuousSSEPrematureEnd>)ContinuousSSEPrematureEnd.Serializer.INSTANCE; } private final Map<String, ContinuousSSEPrematureEnd> getValues() {
/* 27 */     Lazy lazy = ContinuousSSEPrematureEnd.access$getValues$delegate$cp(); return (Map<String, ContinuousSSEPrematureEnd>)lazy.getValue();
/*    */   }
/*    */   @Nullable
/*    */   public final ContinuousSSEPrematureEnd tryParse(@NotNull String value) {
/* 31 */     Intrinsics.checkNotNullParameter(value, "value"); return getValues().get(value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\events\type\ContinuousSSEPrematureEnd$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */