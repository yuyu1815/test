/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.SerializationException;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\b&\030\000*\b\b\000\020\001*\0020\0022\0020\003B\007¢\006\004\b\004\020\005J\033\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0028\000¢\006\002\020\017J\023\020\020\032\0028\0002\006\020\021\032\0020\022¢\006\002\020\023J?\020\024\032\0028\0002\n\020\025\032\006\022\002\b\0030\0262\006\020\027\032\0020\0302\006\020\031\032\0020\0322\006\020\033\032\0020\0342\f\020\035\032\b\022\004\022\0020\0370\036H&¢\006\002\020 R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\t¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/BaseArtifactSerializer;", "T", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Lcom/intellij/ml/llm/matterhorn/Artifactual;)V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/intellij/ml/llm/matterhorn/Artifactual;", "createArtifact", "id", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "statistics", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "title", "", "reasoning", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "dependencies", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;", "(Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/Artifactual;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nArtifact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/BaseArtifactSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,514:1\n476#2,4:515\n571#3,4:519\n329#4,8:523\n329#4,8:531\n329#4,8:539\n329#4,8:547\n329#4,8:555\n*S KotlinDebug\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/BaseArtifactSerializer\n*L\n288#1:515,4\n298#1:519,4\n280#1:523,8\n281#1:531,8\n282#1:539,8\n283#1:547,8\n284#1:555,8\n*E\n"})
/*     */ public abstract class BaseArtifactSerializer<T extends Artifactual>
/*     */ {
/*     */   @NotNull
/* 279 */   private final SerialDescriptor descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("UnfinishedArtifact", new SerialDescriptor[0], BaseArtifactSerializer::descriptor$lambda$0); @NotNull public final SerialDescriptor getDescriptor() { return this.descriptor; } private static final Unit descriptor$lambda$0(ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
/* 280 */     Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor"); ClassSerialDescriptorBuilder classSerialDescriptorBuilder1 = $this$buildClassSerialDescriptor; String elementName$iv = "id";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 525 */     List annotations$iv = CollectionsKt.emptyList();
/* 526 */     boolean isOptional$iv = false;
/*     */     int $i$f$element = 0;
/* 528 */     SerialDescriptor descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 529 */     classSerialDescriptorBuilder1.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     ClassSerialDescriptorBuilder $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "title";
/*     */     isOptional$iv = true;
/* 533 */     annotations$iv = CollectionsKt.emptyList();
/*     */     
/*     */     $i$f$element = 0;
/* 536 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 537 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "reasoning";
/* 541 */     annotations$iv = CollectionsKt.emptyList();
/* 542 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 544 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 545 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "statistics";
/* 549 */     annotations$iv = CollectionsKt.emptyList();
/* 550 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 552 */     descriptor$iv = ArtifactStatistic.Companion.serializer().getDescriptor();
/* 553 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "dependencies";
/* 557 */     annotations$iv = CollectionsKt.emptyList();
/* 558 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 560 */     descriptor$iv = (new ArrayListSerializer(ArtifactDependency.Companion.serializer())).getDescriptor();
/* 561 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public final void serialize(@NotNull Encoder encoder, @NotNull Artifactual value) {
/*     */     Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     Encoder encoder1 = encoder;
/*     */     SerialDescriptor descriptor$iv = this.descriptor;
/*     */     int $i$f$encodeStructure = 0;
/*     */     CompositeEncoder composite$iv = encoder1.beginStructure(descriptor$iv);
/*     */     CompositeEncoder $this$serialize_u24lambda_u241 = composite$iv;
/*     */     int $i$a$-encodeStructure-BaseArtifactSerializer$serialize$1 = 0;
/*     */     $this$serialize_u24lambda_u241.encodeStringElement(getDescriptor(), 0, ArtifactKt.dumpArtifactId(value.getId()));
/*     */     $this$serialize_u24lambda_u241.encodeStringElement(getDescriptor(), 1, value.getTitle());
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 2, (SerializationStrategy)ArtifactReasoning.Companion.serializer(), value.getReasoning());
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 3, (SerializationStrategy)ArtifactStatistic.Companion.serializer(), value.getStatistics());
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 4, (SerializationStrategy)BuiltinSerializersKt.ListSerializer(new ArtifactDependencySerializer()), value.getDependencies());
/*     */     composite$iv.endStructure(descriptor$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final T deserialize(@NotNull Decoder decoder) {
/*     */     Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */     Decoder decoder1 = decoder;
/*     */     SerialDescriptor descriptor$iv = this.descriptor;
/*     */     int $i$f$decodeStructure = 0;
/*     */     CompositeDecoder composite$iv = decoder1.beginStructure(descriptor$iv);
/*     */     CompositeDecoder $this$deserialize_u24lambda_u242 = composite$iv;
/*     */     int $i$a$-decodeStructure-BaseArtifactSerializer$deserialize$1 = 0;
/*     */     ArtifactId<?> id = null;
/*     */     String title = null;
/*     */     ArtifactReasoning reasoning = null;
/*     */     ArtifactStatistic statistics = null;
/*     */     List dependencies = null;
/*     */     while (true) {
/*     */       int index = $this$deserialize_u24lambda_u242.decodeElementIndex(getDescriptor());
/*     */       if (index != -1) {
/*     */         switch (index) {
/*     */           case 0:
/*     */             id = ArtifactKt.parseArtifactId($this$deserialize_u24lambda_u242.decodeStringElement(getDescriptor(), 0));
/*     */             continue;
/*     */           case 1:
/*     */             title = $this$deserialize_u24lambda_u242.decodeStringElement(getDescriptor(), 1);
/*     */             continue;
/*     */           case 2:
/*     */             reasoning = (ArtifactReasoning)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 2, (DeserializationStrategy)ArtifactReasoning.Companion.serializer(), null, 8, null);
/*     */             continue;
/*     */           case 3:
/*     */             statistics = (ArtifactStatistic)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 3, (DeserializationStrategy)ArtifactStatistic.Companion.serializer(), null, 8, null);
/*     */             continue;
/*     */           case 4:
/*     */             dependencies = (List)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 4, (DeserializationStrategy)BuiltinSerializersKt.ListSerializer(new ArtifactDependencySerializer()), null, 8, null);
/*     */             continue;
/*     */         } 
/*     */         throw new SerializationException("Unexpected index " + index);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     if (id == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("id"); 
/*     */     if (statistics == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("statistics"); 
/*     */     if (title == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("title"); 
/*     */     if (reasoning == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("reasoning"); 
/*     */     if (dependencies == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("dependencies"); 
/*     */     Object result$iv = title.createArtifact(null, (ArtifactStatistic)reasoning, null, (ArtifactReasoning)dependencies, null);
/*     */     composite$iv.endStructure(descriptor$iv);
/*     */     return (T)result$iv;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public abstract T createArtifact(@NotNull ArtifactId<?> paramArtifactId, @NotNull ArtifactStatistic paramArtifactStatistic, @NotNull String paramString, @NotNull ArtifactReasoning paramArtifactReasoning, @NotNull List<ArtifactDependency> paramList);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\BaseArtifactSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */