/*    */ package ai.grazie.model.cloud;
/*    */ 
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001:\001\007B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004J\017\020\005\032\b\022\004\022\0020\0040\006HÆ\001¨\006\b"}, d2 = {"Lai/grazie/model/cloud/RequestID$Companion;", "", "()V", "random", "Lai/grazie/model/cloud/RequestID;", "serializer", "Lkotlinx/serialization/KSerializer;", "Serializer", "model-cloud"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/* 14 */   public final KSerializer<RequestID> serializer() { return (KSerializer<RequestID>)Serializer.INSTANCE; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/cloud/RequestID$Companion$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/model/cloud/RequestID;", "()V", "model-cloud"})
/* 15 */   public static final class Serializer extends StringValueClassSerializer<RequestID> { private Serializer() { super("RequestID", null.INSTANCE, null.INSTANCE); } @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer(); } @NotNull
/* 17 */   public final RequestID random() { return new RequestID(UUID.Companion.random()); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\RequestID$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */