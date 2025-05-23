/*    */ package ai.grazie.gen.tasks.fs.fleet.respondToGetDirectories;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B5\b\021\022\006\020\002\032\0020\003\022\b\b\001\020\004\032\0020\003\022\020\b\001\020\005\032\n\022\004\022\0020\007\030\0010\006\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\033\022\006\020\004\032\0020\003\022\f\020\005\032\b\022\004\022\0020\0070\006¢\006\002\020\013J\t\020\023\032\0020\003HÆ\003J\017\020\024\032\b\022\004\022\0020\0070\006HÆ\003J#\020\025\032\0020\0002\b\b\002\020\004\032\0020\0032\016\b\002\020\005\032\b\022\004\022\0020\0070\006HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\007HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\f\020\r\032\004\b\016\020\017R\"\020\005\032\b\022\004\022\0020\0070\0068\006X\004¢\006\016\n\000\022\004\b\020\020\r\032\004\b\021\020\022¨\006%"}, d2 = {"Lai/grazie/gen/tasks/fs/fleet/respondToGetDirectories/FsRespondToGetDirectoriesTaskParams;", "", "seen1", "", "maxDepth", "paths", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/util/List;)V", "getMaxDepth$annotations", "()V", "getMaxDepth", "()I", "getPaths$annotations", "getPaths", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class FsRespondToGetDirectoriesTaskParams {
/*    */   @NotNull
/* 29 */   public static final Companion Companion = new Companion(null); private final int maxDepth; @NotNull
/*    */   private final List<String> paths; @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers;
/*    */   
/* 34 */   public FsRespondToGetDirectoriesTaskParams(int maxDepth, @NotNull List<String> paths) { this.maxDepth = maxDepth;
/*    */ 
/*    */     
/* 37 */     this.paths = paths; } @NotNull
/* 38 */   public final List<String> getPaths() { return this.paths; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/fs/fleet/respondToGetDirectories/FsRespondToGetDirectoriesTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/fs/fleet/respondToGetDirectories/FsRespondToGetDirectoriesTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<FsRespondToGetDirectoriesTaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])FsRespondToGetDirectoriesTaskParams.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*    */       arrayOfKSerializer2[0] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public FsRespondToGetDirectoriesTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0, j = 0;
/*    */       List list = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])FsRespondToGetDirectoriesTaskParams.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new FsRespondToGetDirectoriesTaskParams(i, j, list, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull FsRespondToGetDirectoriesTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       FsRespondToGetDirectoriesTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.fs.fleet.respondToGetDirectories.FsRespondToGetDirectoriesTaskParams", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("maxDepth", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("paths", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/fs/fleet/respondToGetDirectories/FsRespondToGetDirectoriesTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/fs/fleet/respondToGetDirectories/FsRespondToGetDirectoriesTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<FsRespondToGetDirectoriesTaskParams> serializer() {
/*    */       return (KSerializer<FsRespondToGetDirectoriesTaskParams>)FsRespondToGetDirectoriesTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   public final int getMaxDepth() {
/*    */     return this.maxDepth;
/*    */   }
/*    */   
/*    */   public final int component1() {
/*    */     return this.maxDepth;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component2() {
/*    */     return this.paths;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FsRespondToGetDirectoriesTaskParams copy(int maxDepth, @NotNull List<String> paths) {
/*    */     Intrinsics.checkNotNullParameter(paths, "paths");
/*    */     return new FsRespondToGetDirectoriesTaskParams(maxDepth, paths);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FsRespondToGetDirectoriesTaskParams(maxDepth=" + this.maxDepth + ", paths=" + this.paths + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.maxDepth);
/*    */     return result * 31 + this.paths.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FsRespondToGetDirectoriesTaskParams))
/*    */       return false; 
/*    */     FsRespondToGetDirectoriesTaskParams fsRespondToGetDirectoriesTaskParams = (FsRespondToGetDirectoriesTaskParams)other;
/*    */     return (this.maxDepth != fsRespondToGetDirectoriesTaskParams.maxDepth) ? false : (!!Intrinsics.areEqual(this.paths, fsRespondToGetDirectoriesTaskParams.paths));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\fs\fleet\respondToGetDirectories\FsRespondToGetDirectoriesTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */