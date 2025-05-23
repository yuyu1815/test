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
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\030\002\n\000\030\000*\004\b\000\020\0012\b\022\004\022\0020\0030\002B\025\022\f\020\004\032\b\022\004\022\0028\0000\005¢\006\004\b\006\020\007J\020\020\016\032\0020\0032\006\020\017\032\0020\020H\026R\027\020\004\032\b\022\004\022\0028\0000\005¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\f\020\r¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactualDeserializer;", "O", "Lkotlinx/serialization/DeserializationStrategy;", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "dataSerializer", "Lkotlinx/serialization/KSerializer;", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "getDataSerializer", "()Lkotlinx/serialization/KSerializer;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nArtifact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/ArtifactualDeserializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 3 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,514:1\n571#2,4:515\n329#3,8:519\n329#3,8:527\n329#3,8:535\n329#3,8:543\n329#3,8:551\n329#3,8:559\n*S KotlinDebug\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/ArtifactualDeserializer\n*L\n372#1:515,4\n362#1:519,8\n363#1:527,8\n364#1:535,8\n365#1:543,8\n366#1:551,8\n367#1:559,8\n*E\n"})
/*     */ public final class ArtifactualDeserializer<O>
/*     */   implements DeserializationStrategy<Artifactual>
/*     */ {
/*     */   @NotNull
/*     */   private final KSerializer<O> dataSerializer;
/*     */   @NotNull
/*     */   private final SerialDescriptor descriptor;
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<O> getDataSerializer() {
/*     */     return this.dataSerializer;
/*     */   }
/*     */   
/*     */   public ArtifactualDeserializer(@NotNull KSerializer<O> dataSerializer) {
/* 360 */     this.dataSerializer = dataSerializer;
/* 361 */     this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("Artifactual", new SerialDescriptor[0], this::descriptor$lambda$0); } @NotNull public SerialDescriptor getDescriptor() { return this.descriptor; } private static final Unit descriptor$lambda$0(ArtifactualDeserializer this$0, ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) {
/* 362 */     Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor"); ClassSerialDescriptorBuilder classSerialDescriptorBuilder1 = $this$buildClassSerialDescriptor; String elementName$iv = "id";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 521 */     List annotations$iv = CollectionsKt.emptyList();
/* 522 */     boolean isOptional$iv = false;
/*     */     int $i$f$element = 0;
/* 524 */     SerialDescriptor descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 525 */     classSerialDescriptorBuilder1.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     ClassSerialDescriptorBuilder $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "title";
/*     */     isOptional$iv = true;
/* 529 */     annotations$iv = CollectionsKt.emptyList();
/*     */     
/*     */     $i$f$element = 0;
/* 532 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 533 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "description";
/* 537 */     annotations$iv = CollectionsKt.emptyList();
/* 538 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 540 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 541 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "reasoning";
/* 545 */     annotations$iv = CollectionsKt.emptyList();
/* 546 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 548 */     descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 549 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "statistics";
/* 553 */     annotations$iv = CollectionsKt.emptyList();
/* 554 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 556 */     descriptor$iv = ArtifactStatistic.Companion.serializer().getDescriptor();
/* 557 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     
/*     */     $this$element_u24default$iv = $this$buildClassSerialDescriptor;
/*     */     elementName$iv = "dependencies";
/* 561 */     annotations$iv = CollectionsKt.emptyList();
/* 562 */     isOptional$iv = false;
/*     */     $i$f$element = 0;
/* 564 */     descriptor$iv = (new ArrayListSerializer(ArtifactDependency.Companion.serializer())).getDescriptor();
/* 565 */     $this$element_u24default$iv.element(elementName$iv, descriptor$iv, annotations$iv, isOptional$iv);
/*     */     ClassSerialDescriptorBuilder.element$default($this$buildClassSerialDescriptor, "content", this$0.dataSerializer.getDescriptor(), null, false, 12, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Artifactual deserialize(@NotNull Decoder decoder) {
/*     */     Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */     Decoder decoder1 = decoder;
/*     */     SerialDescriptor descriptor$iv = getDescriptor();
/*     */     int $i$f$decodeStructure = 0;
/*     */     CompositeDecoder composite$iv = decoder1.beginStructure(descriptor$iv);
/*     */     CompositeDecoder $this$deserialize_u24lambda_u241 = composite$iv;
/*     */     int $i$a$-decodeStructure-ArtifactualDeserializer$deserialize$1 = 0;
/*     */     ArtifactId<?> id = null;
/*     */     String title = null;
/*     */     String description = null;
/*     */     ArtifactReasoning reasoning = null;
/*     */     ArtifactStatistic statistics = null;
/*     */     List dependencies = null;
/*     */     Object content = null;
/*     */     while (true) {
/*     */       int index = $this$deserialize_u24lambda_u241.decodeElementIndex(getDescriptor());
/*     */       if (index != -1) {
/*     */         switch (index) {
/*     */           case 0:
/*     */             Intrinsics.checkNotNull(ArtifactKt.parseArtifactId($this$deserialize_u24lambda_u241.decodeStringElement(getDescriptor(), 0)), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ArtifactId<O of com.intellij.ml.llm.matterhorn.ArtifactualDeserializer>");
/*     */             id = ArtifactKt.parseArtifactId($this$deserialize_u24lambda_u241.decodeStringElement(getDescriptor(), 0));
/*     */             continue;
/*     */           case 1:
/*     */             title = $this$deserialize_u24lambda_u241.decodeStringElement(getDescriptor(), 1);
/*     */             continue;
/*     */           case 2:
/*     */             description = $this$deserialize_u24lambda_u241.decodeStringElement(getDescriptor(), 2);
/*     */             continue;
/*     */           case 3:
/*     */             reasoning = (ArtifactReasoning)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u241, getDescriptor(), 3, (DeserializationStrategy)ArtifactReasoning.Companion.serializer(), null, 8, null);
/*     */             continue;
/*     */           case 4:
/*     */             statistics = (ArtifactStatistic)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u241, getDescriptor(), 4, (DeserializationStrategy)ArtifactStatistic.Companion.serializer(), null, 8, null);
/*     */             continue;
/*     */           case 5:
/*     */             dependencies = (List)CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u241, getDescriptor(), 5, (DeserializationStrategy)BuiltinSerializersKt.ListSerializer(new ArtifactDependencySerializer()), null, 8, null);
/*     */             continue;
/*     */           case 6:
/*     */             content = CompositeDecoder.decodeSerializableElement$default($this$deserialize_u24lambda_u241, getDescriptor(), 6, (DeserializationStrategy)getDataSerializer(), null, 8, null);
/*     */             continue;
/*     */         } 
/*     */         throw new SerializationException("Unexpected index " + index);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     if (reasoning == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("reasoning"); 
/*     */     Object object = null;
/*     */     if (id == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("id"); 
/*     */     if (statistics == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("statistics"); 
/*     */     if (title == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("title"); 
/*     */     if (dependencies == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("dependencies"); 
/*     */     super((ArtifactId<?>)title, null, (String)dependencies, null, (ArtifactReasoning.Cancelled)reasoning);
/*     */     if (id == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("id"); 
/*     */     if (statistics == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("statistics"); 
/*     */     if (title == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("title"); 
/*     */     if (dependencies == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("dependencies"); 
/*     */     super((ArtifactId<?>)title, null, (String)dependencies, null, (ArtifactReasoning.Failure)reasoning);
/*     */     if (id == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("id"); 
/*     */     if (statistics == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("statistics"); 
/*     */     if (title == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("title"); 
/*     */     if (description == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("description"); 
/*     */     if (dependencies == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("dependencies"); 
/*     */     Intrinsics.checkNotNull(content);
/*     */     super(null, (ArtifactStatistic)description, null, (String)dependencies, null, reasoning, (O)content);
/*     */     Object result$iv = (object instanceof ArtifactReasoning.Cancelled) ? statistics : ((object instanceof ArtifactReasoning.Failure) ? statistics : null);
/*     */     composite$iv.endStructure(descriptor$iv);
/*     */     return (Artifactual)result$iv;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ArtifactualDeserializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */