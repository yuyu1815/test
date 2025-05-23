/*    */ package ai.grazie.gen.tasks.vcs.fleet.generateUpdateSummary;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\023\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 ,2\0020\001:\002+,BI\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\005\022\n\b\001\020\007\032\004\030\0010\005\022\n\b\001\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\t¢\006\002\020\rJ\t\020\031\032\0020\005HÆ\003J\t\020\032\032\0020\005HÆ\003J\t\020\033\032\0020\005HÆ\003J\t\020\034\032\0020\tHÆ\003J1\020\035\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\b\b\002\020\b\032\0020\tHÆ\001J\023\020\036\032\0020\0372\b\020 \032\004\030\0010\001HÖ\003J\t\020!\032\0020\003HÖ\001J\t\020\"\032\0020\005HÖ\001J&\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)HÁ\001¢\006\002\b*R\034\020\b\032\0020\t8\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R\034\020\007\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\024R\034\020\006\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\025\020\017\032\004\b\026\020\024R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\027\020\017\032\004\b\030\020\024¨\006-"}, d2 = {"Lai/grazie/gen/tasks/vcs/fleet/generateUpdateSummary/Meta;", "", "seen1", "", "timestamp", "", "subject", "body", "author", "Lai/grazie/gen/tasks/vcs/fleet/generateUpdateSummary/Author;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/gen/tasks/vcs/fleet/generateUpdateSummary/Author;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/gen/tasks/vcs/fleet/generateUpdateSummary/Author;)V", "getAuthor$annotations", "()V", "getAuthor", "()Lai/grazie/gen/tasks/vcs/fleet/generateUpdateSummary/Author;", "getBody$annotations", "getBody", "()Ljava/lang/String;", "getSubject$annotations", "getSubject", "getTimestamp$annotations", "getTimestamp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class Meta {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String timestamp;
/*    */   
/*    */   public Meta(@NotNull String timestamp, @NotNull String subject, @NotNull String body, @NotNull Author author) {
/* 37 */     this.timestamp = timestamp;
/*    */ 
/*    */     
/* 40 */     this.subject = subject;
/*    */ 
/*    */     
/* 43 */     this.body = body;
/*    */ 
/*    */     
/* 46 */     this.author = author; } @NotNull private final String subject; @NotNull private final String body; @NotNull private final Author author; @NotNull
/* 47 */   public final Author getAuthor() { return this.author; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/vcs/fleet/generateUpdateSummary/Meta.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/vcs/fleet/generateUpdateSummary/Meta;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<Meta> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)Author.$serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Meta deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null, str3 = null;
/*    */       Author author = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         author = (Author)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Author.$serializer.INSTANCE, author);
/*    */         i |= 0x8;
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
/*    */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               author = (Author)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Author.$serializer.INSTANCE, author);
/*    */               i |= 0x8;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new Meta(i, str1, str2, str3, author, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Meta value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       Meta.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.vcs.fleet.generateUpdateSummary.Meta", INSTANCE, 4);
/*    */       pluginGeneratedSerialDescriptor.addElement("timestamp", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("subject", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("body", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("author", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/vcs/fleet/generateUpdateSummary/Meta$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/vcs/fleet/generateUpdateSummary/Meta;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Meta> serializer() {
/*    */       return (KSerializer<Meta>)Meta.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getTimestamp() {
/*    */     return this.timestamp;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getSubject() {
/*    */     return this.subject;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getBody() {
/*    */     return this.body;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.timestamp;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.subject;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.body;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Author component4() {
/*    */     return this.author;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Meta copy(@NotNull String timestamp, @NotNull String subject, @NotNull String body, @NotNull Author author) {
/*    */     Intrinsics.checkNotNullParameter(timestamp, "timestamp");
/*    */     Intrinsics.checkNotNullParameter(subject, "subject");
/*    */     Intrinsics.checkNotNullParameter(body, "body");
/*    */     Intrinsics.checkNotNullParameter(author, "author");
/*    */     return new Meta(timestamp, subject, body, author);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Meta(timestamp=" + this.timestamp + ", subject=" + this.subject + ", body=" + this.body + ", author=" + this.author + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.timestamp.hashCode();
/*    */     result = result * 31 + this.subject.hashCode();
/*    */     result = result * 31 + this.body.hashCode();
/*    */     return result * 31 + this.author.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Meta))
/*    */       return false; 
/*    */     Meta meta = (Meta)other;
/*    */     return !Intrinsics.areEqual(this.timestamp, meta.timestamp) ? false : (!Intrinsics.areEqual(this.subject, meta.subject) ? false : (!Intrinsics.areEqual(this.body, meta.body) ? false : (!!Intrinsics.areEqual(this.author, meta.author))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\vcs\fleet\generateUpdateSummary\Meta.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */