/*    */ package ai.grazie.api.gateway.api.indexing;
/*    */ 
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor;
/*    */ import ai.grazie.code.indexing.model.IndexDescriptor$;
/*    */ import ai.grazie.code.indexing.model.request.IndexDescriptorRequest;
/*    */ import ai.grazie.code.indexing.model.snapshot.Snapshot;
/*    */ import ai.grazie.code.indexing.model.snapshot.Snapshot$;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\031HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006$"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Snapshots$FinalizeSnapshot$Request;", "Lai/grazie/code/indexing/model/request/IndexDescriptorRequest;", "seen1", "", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "descriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/code/indexing/model/snapshot/Snapshot;Lai/grazie/code/indexing/model/IndexDescriptor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/code/indexing/model/snapshot/Snapshot;Lai/grazie/code/indexing/model/IndexDescriptor;)V", "getDescriptor", "()Lai/grazie/code/indexing/model/IndexDescriptor;", "getSnapshot", "()Lai/grazie/code/indexing/model/snapshot/Snapshot;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request
/*    */   implements IndexDescriptorRequest {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Snapshot snapshot;
/*    */   @NotNull
/*    */   private final IndexDescriptor descriptor;
/*    */   
/*    */   public Request(@NotNull Snapshot snapshot, @NotNull IndexDescriptor descriptor) {
/* 43 */     this.snapshot = snapshot;
/* 44 */     this.descriptor = descriptor; } @NotNull public IndexDescriptor getDescriptor() { return this.descriptor; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/indexing/IndexingAPI.Snapshots.FinalizeSnapshot.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Snapshots$FinalizeSnapshot$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */   public static final class $serializer implements GeneratedSerializer<Request> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)Snapshot$.serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)IndexDescriptor$.serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public IndexingAPI.Snapshots.FinalizeSnapshot.Request deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Snapshot snapshot = null;
/*    */       IndexDescriptor indexDescriptor = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*    */         i |= 0x1;
/*    */         indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot$.serializer.INSTANCE, snapshot);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               indexDescriptor = (IndexDescriptor)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IndexDescriptor$.serializer.INSTANCE, indexDescriptor);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new IndexingAPI.Snapshots.FinalizeSnapshot.Request(i, snapshot, indexDescriptor, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull IndexingAPI.Snapshots.FinalizeSnapshot.Request value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       IndexingAPI.Snapshots.FinalizeSnapshot.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.indexing.IndexingAPI.Snapshots.FinalizeSnapshot.Request", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("snapshot", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("descriptor", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/indexing/IndexingAPI$Snapshots$FinalizeSnapshot$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/indexing/IndexingAPI$Snapshots$FinalizeSnapshot$Request;", "api-gateway-api"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<IndexingAPI.Snapshots.FinalizeSnapshot.Request> serializer() {
/*    */       return (KSerializer<IndexingAPI.Snapshots.FinalizeSnapshot.Request>)IndexingAPI.Snapshots.FinalizeSnapshot.Request.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Snapshot getSnapshot() {
/*    */     return this.snapshot;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Snapshot component1() {
/*    */     return this.snapshot;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IndexDescriptor component2() {
/*    */     return this.descriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull Snapshot snapshot, @NotNull IndexDescriptor descriptor) {
/*    */     Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*    */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*    */     return new Request(snapshot, descriptor);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(snapshot=" + this.snapshot + ", descriptor=" + this.descriptor + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.snapshot.hashCode();
/*    */     return result * 31 + this.descriptor.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.snapshot, request.snapshot) ? false : (!!Intrinsics.areEqual(this.descriptor, request.descriptor));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\indexing\IndexingAPI$Snapshots$FinalizeSnapshot$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */