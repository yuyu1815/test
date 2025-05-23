/*     */ package com.intellij.ml.llm.matterhorn.events;
/*     */ 
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlin.text.Charsets;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\020\034\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\034\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nJ\034\020\013\032\b\022\004\022\0020\b0\f2\006\020\r\032\0020\0052\006\020\t\032\0020\nJ\024\020\013\032\b\022\004\022\0020\b0\f2\006\020\016\032\0020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonLogger$Companion;", "", "<init>", "()V", "serialize", "", "events", "", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventWithMetadata;", "serializer", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;", "deserialize", "", "data", "path", "Ljava/nio/file/Path;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nSerializableEventJsonLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializableEventJsonLogger.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventJsonLogger$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1611#2,9:104\n1863#2:113\n1864#2:115\n1620#2:116\n1#3:114\n*S KotlinDebug\n*F\n+ 1 SerializableEventJsonLogger.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventJsonLogger$Companion\n*L\n95#1:104,9\n95#1:113\n95#1:115\n95#1:116\n95#1:114\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final String serialize(@NotNull Iterable events, @NotNull SerializableEventJsonSerializer serializer) {
/*  88 */     Intrinsics.checkNotNullParameter(events, "events"); Intrinsics.checkNotNullParameter(serializer, "serializer"); return SequencesKt.joinToString$default(SequencesKt.map(CollectionsKt.asSequence(events), new SerializableEventJsonLogger$Companion$serialize$1(serializer)), "\n", null, null, 0, null, null, 62, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<SerializableEventWithMetadata> deserialize(@NotNull String data, @NotNull SerializableEventJsonSerializer serializer) {
/*  95 */     Intrinsics.checkNotNullParameter(data, "data"); Intrinsics.checkNotNullParameter(serializer, "serializer"); String[] arrayOfString = new String[1]; arrayOfString[0] = "\n"; Iterable $this$mapNotNull$iv = StringsKt.split$default(data, arrayOfString, false, 0, 6, null); int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 113 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; String line = (String)element$iv$iv;
/*     */       int $i$a$-mapNotNull-SerializableEventJsonLogger$Companion$deserialize$1 = 0; }
/*     */     
/* 116 */     return (List<SerializableEventWithMetadata>)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<SerializableEventWithMetadata> deserialize(@NotNull Path path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     Intrinsics.checkNotNullExpressionValue(Files.readString(path, Charsets.UTF_8), "readString(...)");
/*     */     return deserialize(Files.readString(path, Charsets.UTF_8), SerializableEventUpdatableSerializer.INSTANCE.getSerializer());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\events\SerializableEventJsonLogger$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */