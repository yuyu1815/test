/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerializationException;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.SerializersKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\024\022\020\022\016\022\004\022\002H\001\022\004\022\002H\0020\0040\003B/\022\030\020\005\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0060\003\022\f\020\007\032\b\022\004\022\0028\0010\003¢\006\004\b\b\020\tJ$\020\021\032\0020\0222\006\020\023\032\0020\0242\022\020\025\032\016\022\004\022\0028\000\022\004\022\0028\0010\004H\026J\034\020\026\032\016\022\004\022\0028\000\022\004\022\0028\0010\0042\006\020\027\032\0020\030H\026R#\020\005\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0060\003¢\006\b\n\000\032\004\b\n\020\013R\027\020\007\032\b\022\004\022\0028\0010\003¢\006\b\n\000\032\004\b\f\020\013R\024\020\r\032\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifactSerializer;", "I", "O", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;", "dataSerializer", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "dataSerializerO", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "getDataSerializer", "()Lkotlinx/serialization/KSerializer;", "getDataSerializerO", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nArtifact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/UnfinishedArtifactSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,514:1\n476#2,4:515\n571#3,4:519\n329#4,8:523\n329#4,8:531\n329#4,8:539\n329#4,8:547\n329#4,8:555\n*S KotlinDebug\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/UnfinishedArtifactSerializer\n*L\n473#1:515,4\n483#1:519,4\n465#1:523,8\n466#1:531,8\n467#1:539,8\n468#1:547,8\n469#1:555,8\n*E\n"})
/*     */ public final class UnfinishedArtifactSerializer<I, O>
/*     */   implements KSerializer<UnfinishedArtifact<I, O>>
/*     */ {
/*     */   @NotNull
/*     */   private final KSerializer<ArtifactRequest<I, O>> dataSerializer;
/*     */   @NotNull
/*     */   private final KSerializer<O> dataSerializerO;
/*     */   @NotNull
/*     */   private final SerialDescriptor descriptor;
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<ArtifactRequest<I, O>> getDataSerializer() {
/*     */     return this.dataSerializer;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<O> getDataSerializerO() {
/*     */     return this.dataSerializerO;
/*     */   }
/*     */   
/*     */   public UnfinishedArtifactSerializer(@NotNull KSerializer<ArtifactRequest<I, O>> dataSerializer, @NotNull KSerializer<O> dataSerializerO) {
/* 462 */     this.dataSerializer = dataSerializer; this.dataSerializerO = dataSerializerO;
/*     */     
/* 464 */     this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("UnfinishedArtifact", new SerialDescriptor[0], UnfinishedArtifactSerializer::descriptor$lambda$0); } @NotNull public SerialDescriptor getDescriptor() { return this.descriptor; } private static final Unit descriptor$lambda$0(ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
/* 465 */     Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor"); ClassSerialDescriptorBuilder classSerialDescriptorBuilder1 = $this$buildClassSerialDescriptor; String elementName$iv = "artifactRequest";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 528 */     SerialDescriptor descriptor$iv = SerializersKt.noCompiledSerializer("com.intellij.ml.llm.matterhorn.ArtifactRequest").getDescriptor();
/* 529 */     classSerialDescriptorBuilder1.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     ClassSerialDescriptorBuilder $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "statistics";
/* 533 */     annotations$iv = CollectionsKt.emptyList();
/* 534 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 536 */     descriptor$iv = ArtifactStatistic.Companion.serializer().getDescriptor();
/* 537 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "title";
/*     */     isOptional$iv = true;
/* 541 */     annotations$iv = CollectionsKt.emptyList();
/*     */     
/*     */     $i$f$element = 0;
/* 544 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 545 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "dependencies";
/* 549 */     annotations$iv = CollectionsKt.emptyList();
/* 550 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 552 */     descriptor$iv = (new ArrayListSerializer(ArtifactDependency.Companion.serializer())).getDescriptor();
/* 553 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "reasoning";
/* 557 */     annotations$iv = CollectionsKt.emptyList();
/* 558 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 560 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 561 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void serialize(@NotNull Encoder encoder, @NotNull UnfinishedArtifact value) {
/*     */     Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     Encoder encoder1 = encoder;
/*     */     SerialDescriptor descriptor$iv = getDescriptor();
/*     */     int $i$f$encodeStructure = 0;
/*     */     CompositeEncoder composite$iv = encoder1.beginStructure(descriptor$iv);
/*     */     CompositeEncoder $this$serialize_u24lambda_u241 = composite$iv;
/*     */     int $i$a$-encodeStructure-UnfinishedArtifactSerializer$serialize$1 = 0;
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 0, (SerializationStrategy)getDataSerializer(), value.getRequest());
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 1, (SerializationStrategy)ArtifactStatistic.Companion.serializer(), value.getStatistics());
/*     */     $this$serialize_u24lambda_u241.encodeStringElement(getDescriptor(), 2, value.getTitle());
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 3, (SerializationStrategy)BuiltinSerializersKt.ListSerializer(new ArtifactDependencySerializer()), value.getDependencies());
/*     */     $this$serialize_u24lambda_u241.encodeSerializableElement(getDescriptor(), 4, (SerializationStrategy)ArtifactReasoning.Companion.serializer(), value.getReasoning());
/*     */     composite$iv.endStructure(descriptor$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public UnfinishedArtifact<I, O> deserialize(@NotNull Decoder decoder) {
/*     */     Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */     Decoder decoder1 = decoder;
/*     */     SerialDescriptor descriptor$iv = getDescriptor();
/*     */     int $i$f$decodeStructure = 0;
/*     */     CompositeDecoder composite$iv = decoder1.beginStructure(descriptor$iv);
/*     */     CompositeDecoder $this$deserialize_u24lambda_u242 = composite$iv;
/*     */     int $i$a$-decodeStructure-UnfinishedArtifactSerializer$deserialize$1 = 0;
/*     */     ArtifactRequest request = null;
/*     */     ArtifactStatistic statistics = null;
/*     */     String title = null;
/*     */     List dependencies = null;
/*     */     ArtifactReasoning reasoning = null;
/*     */     while (true) {
/*     */       int index = $this$deserialize_u24lambda_u242.decodeElementIndex(getDescriptor());
/*     */       if (index != -1) {
/*     */         switch (index) {
/*     */           case 0:
/*     */             request = (ArtifactRequest)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 0, (DeserializationStrategy)getDataSerializer(), null, 8, null);
/*     */             continue;
/*     */           case 1:
/*     */             statistics = (ArtifactStatistic)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 1, (DeserializationStrategy)ArtifactStatistic.Companion.serializer(), null, 8, null);
/*     */             continue;
/*     */           case 2:
/*     */             title = $this$deserialize_u24lambda_u242.decodeStringElement(getDescriptor(), 2);
/*     */             continue;
/*     */           case 3:
/*     */             reasoning = (ArtifactReasoning)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 3, (DeserializationStrategy)ArtifactReasoning.Companion.serializer(), null, 8, null);
/*     */             continue;
/*     */           case 4:
/*     */             dependencies = (List)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u242, getDescriptor(), 4, (DeserializationStrategy)BuiltinSerializersKt.ListSerializer(new ArtifactDependencySerializer()), null, 8, null);
/*     */             continue;
/*     */         } 
/*     */         throw new SerializationException("Unexpected index " + index);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     if (request == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("request"); 
/*     */     if (statistics == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("statistics"); 
/*     */     if (title == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("title"); 
/*     */     if (dependencies == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("dependencies"); 
/*     */     if (reasoning == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("reasoning"); 
/*     */     super(null, (ArtifactStatistic)dependencies, null, (List<ArtifactDependency>)reasoning, null);
/*     */     Object result$iv = null;
/*     */     composite$iv.endStructure(descriptor$iv);
/*     */     return (UnfinishedArtifact<I, O>)result$iv;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\UnfinishedArtifactSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */