/*    */ package ai.grazie.model.cloud;
/*    */ 
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ 
/*    */ @Serializable(with = RequestID.Companion.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0202\0020\001:\001\020B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\017HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/model/cloud/RequestID;", "", "id", "Lai/grazie/utils/mpp/UUID;", "(Lai/grazie/utils/mpp/UUID;)V", "getId", "()Lai/grazie/utils/mpp/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "model-cloud"})
/*    */ public final class RequestID {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final UUID id;
/*    */   
/* 13 */   public RequestID(@NotNull UUID id) { this.id = id; } @NotNull public final UUID component1() { return this.id; } @NotNull public final RequestID copy(@NotNull UUID id) { Intrinsics.checkNotNullParameter(id, "id"); return new RequestID(id); } @NotNull public String toString() { return "RequestID(id=" + this.id + ")"; } @NotNull public final UUID getId() { return this.id; } public int hashCode() { return this.id.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof RequestID)) return false;  RequestID requestID = (RequestID)other; return !!Intrinsics.areEqual(this.id, requestID.id); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001:\001\007B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004J\017\020\005\032\b\022\004\022\0020\0040\006HÆ\001¨\006\b"}, d2 = {"Lai/grazie/model/cloud/RequestID$Companion;", "", "()V", "random", "Lai/grazie/model/cloud/RequestID;", "serializer", "Lkotlinx/serialization/KSerializer;", "Serializer", "model-cloud"}) public static final class Companion {
/* 14 */     private Companion() {} @NotNull public final KSerializer<RequestID> serializer() { return (KSerializer<RequestID>)Serializer.INSTANCE; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/cloud/RequestID$Companion$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/model/cloud/RequestID;", "()V", "model-cloud"}) public static final class Serializer extends StringValueClassSerializer<RequestID> { @NotNull
/* 15 */       public static final Serializer INSTANCE = new Serializer(); private Serializer() { super("RequestID", null.INSTANCE, null.INSTANCE); } } @NotNull
/*    */     public final RequestID random() {
/* 17 */       return new RequestID(UUID.Companion.random());
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/cloud/RequestID$Companion$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/model/cloud/RequestID;", "()V", "model-cloud"})
/*    */   public static final class Serializer extends StringValueClassSerializer<RequestID> {
/*    */     @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer();
/*    */     
/*    */     private Serializer() {
/*    */       super("RequestID", null.INSTANCE, null.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\RequestID.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */