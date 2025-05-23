/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonBuilder;
/*     */ import kotlinx.serialization.json.JsonKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\003\n\002\b\002\bÆ\002\030\0002\0020\001:\001\016B\t\b\002¢\006\004\b\002\020\003J\"\020\006\032\0020\0072\006\020\b\032\0020\t2\n\020\n\032\006\022\002\b\0030\0132\006\020\f\032\0020\rR\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/FailedDeserializationArtifactDeserializer;", "", "<init>", "()V", "failSafeJson", "Lkotlinx/serialization/json/Json;", "decodeFromJson", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "json", "", "id", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "ex", "", "Strategy", "core"})
/*     */ public final class FailedDeserializationArtifactDeserializer
/*     */ {
/*     */   @NotNull
/* 327 */   public static final FailedDeserializationArtifactDeserializer INSTANCE = new FailedDeserializationArtifactDeserializer(); @NotNull private static final Json failSafeJson = JsonKt.Json$default(null, FailedDeserializationArtifactDeserializer::failSafeJson$lambda$0, 1, null); private static final Unit failSafeJson$lambda$0(JsonBuilder $this$Json) { Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setIgnoreUnknownKeys(true); return Unit.INSTANCE; }
/*     */   @NotNull
/*     */   public final FailedArtifact decodeFromJson(@NotNull String json, @NotNull ArtifactId<?> id, @NotNull Throwable ex) { FailedArtifact failedArtifact;
/* 330 */     Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(id, "id"); Intrinsics.checkNotNullParameter(ex, "ex"); ArtifactReasoning.Failure reasoning = new ArtifactReasoning.Failure(new FailureReason.UnexpectedException("Deserialization error: " + ex.getMessage()));
/*     */     
/* 332 */     try { failedArtifact = (FailedArtifact)failSafeJson.decodeFromString(new Strategy(id, reasoning), json); }
/* 333 */     catch (Throwable <unused var>)
/* 334 */     { failedArtifact = new FailedArtifact(id, null, null, null, reasoning, 14, null); }  return failedArtifact; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\004\n\002\030\002\n\000\b\002\030\0002\b\022\004\022\0020\0020\001B\033\022\n\020\003\032\006\022\002\b\0030\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\020\020\021\032\0020\0022\006\020\022\032\0020\023H\026R\025\020\003\032\006\022\002\b\0030\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/FailedDeserializationArtifactDeserializer$Strategy;", "Lkotlinx/serialization/DeserializationStrategy;", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "id", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "reasoning", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;)V", "getId", "()Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "getReasoning", "()Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "core"}) @SourceDebugExtension({"SMAP\nArtifact.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/FailedDeserializationArtifactDeserializer$Strategy\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 3 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,514:1\n571#2,4:515\n329#3,8:519\n*S KotlinDebug\n*F\n+ 1 Artifact.kt\ncom/intellij/ml/llm/matterhorn/FailedDeserializationArtifactDeserializer$Strategy\n*L\n344#1:515,4\n340#1:519,8\n*E\n"})
/*     */   private static final class Strategy implements DeserializationStrategy<FailedArtifact> { @NotNull
/*     */     private final ArtifactId<?> id; @NotNull
/*     */     private final ArtifactReasoning.Failure reasoning; @NotNull
/* 338 */     private final SerialDescriptor descriptor; public Strategy(@NotNull ArtifactId<?> id, @NotNull ArtifactReasoning.Failure reasoning) { this.id = id; this.reasoning = reasoning;
/* 339 */       this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("Artifact", new SerialDescriptor[0], Strategy::descriptor$lambda$0); } @NotNull public final ArtifactId<?> getId() { return this.id; } @NotNull public SerialDescriptor getDescriptor() { return this.descriptor; }
/* 340 */     @NotNull public final ArtifactReasoning.Failure getReasoning() { return this.reasoning; } private static final Unit descriptor$lambda$0(ClassSerialDescriptorBuilder $this$buildClassSerialDescriptor) { Intrinsics.checkNotNullParameter($this$buildClassSerialDescriptor, "$this$buildClassSerialDescriptor"); ClassSerialDescriptorBuilder classSerialDescriptorBuilder = $this$buildClassSerialDescriptor; String str = "title"; boolean isOptional$iv = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 521 */       List annotations$iv = CollectionsKt.emptyList();
/*     */       
/*     */       int $i$f$element = 0;
/* 524 */       SerialDescriptor descriptor$iv = StringSerializer.INSTANCE.getDescriptor();
/* 525 */       classSerialDescriptorBuilder.element(str, descriptor$iv, annotations$iv, isOptional$iv);
/*     */       return Unit.INSTANCE; }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public FailedArtifact deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       Decoder decoder1 = decoder;
/*     */       SerialDescriptor descriptor$iv = getDescriptor();
/*     */       int $i$f$decodeStructure = 0;
/*     */       CompositeDecoder composite$iv = decoder1.beginStructure(descriptor$iv);
/*     */       CompositeDecoder $this$deserialize_u24lambda_u241 = composite$iv;
/*     */       int $i$a$-decodeStructure-FailedDeserializationArtifactDeserializer$Strategy$deserialize$1 = 0;
/*     */       String title = null;
/*     */       while (true) {
/*     */         int index = $this$deserialize_u24lambda_u241.decodeElementIndex(getDescriptor());
/*     */         if (index != -1) {
/*     */           if (index == 0)
/*     */             title = $this$deserialize_u24lambda_u241.decodeStringElement(getDescriptor(), 0); 
/*     */           continue;
/*     */         } 
/*     */         break;
/*     */       } 
/*     */       if (title == null)
/*     */         Intrinsics.throwUninitializedPropertyAccessException("title"); 
/*     */       super(null, (ArtifactStatistic)title, null, null, getReasoning(), 10, null);
/*     */       Object result$iv;
/*     */       composite$iv.endStructure(descriptor$iv);
/*     */       return (FailedArtifact)result$iv;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\FailedDeserializationArtifactDeserializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */