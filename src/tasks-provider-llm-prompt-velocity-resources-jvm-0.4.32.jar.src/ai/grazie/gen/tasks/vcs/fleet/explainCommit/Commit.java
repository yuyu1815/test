/*    */ package ai.grazie.gen.tasks.vcs.fleet.explainCommit;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
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
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(B=\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\007\022\n\b\001\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\035\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\005¢\006\002\020\fJ\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\007HÆ\003J\t\020\030\032\0020\005HÆ\003J'\020\031\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\005HÆ\001J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\001HÖ\003J\t\020\035\032\0020\003HÖ\001J\t\020\036\032\0020\005HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\034\020\b\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\r\020\016\032\004\b\017\020\020R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\021\020\016\032\004\b\022\020\020R\034\020\006\032\0020\0078\006X\004¢\006\016\n\000\022\004\b\023\020\016\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/gen/tasks/vcs/fleet/explainCommit/Commit;", "", "seen1", "", "hash", "", "meta", "Lai/grazie/gen/tasks/vcs/fleet/explainCommit/Meta;", "diff", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/gen/tasks/vcs/fleet/explainCommit/Meta;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/gen/tasks/vcs/fleet/explainCommit/Meta;Ljava/lang/String;)V", "getDiff$annotations", "()V", "getDiff", "()Ljava/lang/String;", "getHash$annotations", "getHash", "getMeta$annotations", "getMeta", "()Lai/grazie/gen/tasks/vcs/fleet/explainCommit/Meta;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class Commit {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String hash;
/*    */   
/* 36 */   public Commit(@NotNull String hash, @NotNull Meta meta, @NotNull String diff) { this.hash = hash;
/*    */ 
/*    */     
/* 39 */     this.meta = meta;
/*    */ 
/*    */     
/* 42 */     this.diff = diff; } @NotNull private final Meta meta; @NotNull private final String diff; @NotNull
/* 43 */   public final String getDiff() { return this.diff; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/vcs/fleet/explainCommit/Commit.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/vcs/fleet/explainCommit/Commit;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<Commit> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)Meta.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Commit deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null;
/*    */       Meta meta = null;
/*    */       String str2 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         meta = (Meta)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Meta.$serializer.INSTANCE, meta);
/*    */         i |= 0x2;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               meta = (Meta)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Meta.$serializer.INSTANCE, meta);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new Commit(i, str1, meta, str2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Commit value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       Commit.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.vcs.fleet.explainCommit.Commit", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("hash", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("meta", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("diff", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/vcs/fleet/explainCommit/Commit$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/vcs/fleet/explainCommit/Commit;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Commit> serializer() {
/*    */       return (KSerializer<Commit>)Commit.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getHash() {
/*    */     return this.hash;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Meta getMeta() {
/*    */     return this.meta;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.hash;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Meta component2() {
/*    */     return this.meta;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.diff;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Commit copy(@NotNull String hash, @NotNull Meta meta, @NotNull String diff) {
/*    */     Intrinsics.checkNotNullParameter(hash, "hash");
/*    */     Intrinsics.checkNotNullParameter(meta, "meta");
/*    */     Intrinsics.checkNotNullParameter(diff, "diff");
/*    */     return new Commit(hash, meta, diff);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Commit(hash=" + this.hash + ", meta=" + this.meta + ", diff=" + this.diff + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.hash.hashCode();
/*    */     result = result * 31 + this.meta.hashCode();
/*    */     return result * 31 + this.diff.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Commit))
/*    */       return false; 
/*    */     Commit commit = (Commit)other;
/*    */     return !Intrinsics.areEqual(this.hash, commit.hash) ? false : (!Intrinsics.areEqual(this.meta, commit.meta) ? false : (!!Intrinsics.areEqual(this.diff, commit.diff)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\vcs\fleet\explainCommit\Commit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */