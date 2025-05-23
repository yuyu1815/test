/*     */ package com.intellij.ml.llm.matterhorn.events;
/*     */ import java.io.IOException;
/*     */ import java.io.Writer;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\030\000 \0262\0020\001:\001\026B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B\021\b\026\022\006\020\b\032\0020\t¢\006\004\b\006\020\nJ\016\020\r\032\0020\0162\006\020\017\032\0020\020J\026\020\021\032\n\030\0010\022j\004\030\001`\0232\006\020\017\032\0020\020J\006\020\024\032\0020\016J\b\020\025\032\0020\016H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\013\032\0020\fX\016¢\006\002\n\000¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonLogger;", "Ljava/io/Closeable;", "writer", "Ljava/io/Writer;", "serializer", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;", "<init>", "(Ljava/io/Writer;Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;)V", "filePath", "Ljava/nio/file/Path;", "(Ljava/nio/file/Path;)V", "closed", "", "log", "", "data", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventWithMetadata;", "logWithCatchingAndLoggingSerializationError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "flush", "close", "Companion", "core"})
/*     */ public final class SerializableEventJsonLogger implements Closeable {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Writer writer;
/*     */   
/*     */   public SerializableEventJsonLogger(@NotNull Writer writer, @NotNull SerializableEventJsonSerializer serializer) {
/*  17 */     this.writer = writer;
/*  18 */     this.serializer = serializer;
/*     */   } @NotNull
/*     */   private final SerializableEventJsonSerializer serializer; private boolean closed;
/*     */   public SerializableEventJsonLogger(@NotNull Path filePath) {
/*  22 */     this(
/*  23 */         Files.newBufferedWriter(
/*  24 */           filePath, 
/*  25 */           Charsets.UTF_8, 
/*  26 */           arrayOfOpenOption), 
/*     */ 
/*     */ 
/*     */         
/*  30 */         SerializableEventUpdatableSerializer.INSTANCE.getSerializer());
/*     */   }
/*     */ 
/*     */   
/*     */   public final void log(@NotNull SerializableEventWithMetadata data) throws SerializationException, IOException, ConcurrentModificationException {
/*  35 */     Intrinsics.checkNotNullParameter(data, "data"); synchronized (this) { int $i$a$-synchronized-SerializableEventJsonLogger$log$1 = 0;
/*  36 */       if (this.closed)
/*  37 */         return;  String str = this.serializer.serialize(data);
/*  38 */       this.writer.write(str);
/*  39 */       this.writer.write("\n");
/*  40 */       Unit unit = Unit.INSTANCE; }
/*     */   
/*     */   }
/*     */   @Nullable
/*     */   public final Exception logWithCatchingAndLoggingSerializationError(@NotNull SerializableEventWithMetadata data) throws IOException {
/*  45 */     Intrinsics.checkNotNullParameter(data, "data"); try {
/*  46 */       log(data);
/*  47 */       return null;
/*  48 */     } catch (IOException e) {
/*  49 */       throw e;
/*     */     }
/*  51 */     catch (Exception e) {
/*     */       
/*  53 */       Intrinsics.checkNotNullExpressionValue(data.getEvent().getClass().getName(), "getName(...)"); SerializableEventSerializationError errorEvent = new SerializableEventSerializationError(data.getEvent().getClass().getName(), 
/*  54 */           new SerializableThrowable(e, true));
/*     */       
/*  56 */       log(SerializableEventWithMetadataKt.withMetadata(errorEvent));
/*  57 */       return e;
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void flush() {
/*  62 */     synchronized (this) { int $i$a$-synchronized-SerializableEventJsonLogger$flush$1 = 0;
/*  63 */       if (!this.closed) {
/*  64 */         this.writer.flush();
/*     */       }
/*  66 */       Unit unit = Unit.INSTANCE; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/*  74 */     synchronized (this) { int $i$a$-synchronized-SerializableEventJsonLogger$close$1 = 0;
/*  75 */       if (!this.closed) {
/*  76 */         this.closed = true;
/*  77 */         this.writer.flush();
/*  78 */         this.writer.close();
/*     */       } 
/*  80 */       Unit unit = Unit.INSTANCE; }
/*     */   
/*     */   }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\020\034\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\034\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nJ\034\020\013\032\b\022\004\022\0020\b0\f2\006\020\r\032\0020\0052\006\020\t\032\0020\nJ\024\020\013\032\b\022\004\022\0020\b0\f2\006\020\016\032\0020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonLogger$Companion;", "", "<init>", "()V", "serialize", "", "events", "", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventWithMetadata;", "serializer", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEventJsonSerializer;", "deserialize", "", "data", "path", "Ljava/nio/file/Path;", "core"})
/*     */   @SourceDebugExtension({"SMAP\nSerializableEventJsonLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializableEventJsonLogger.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventJsonLogger$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1611#2,9:104\n1863#2:113\n1864#2:115\n1620#2:116\n1#3:114\n*S KotlinDebug\n*F\n+ 1 SerializableEventJsonLogger.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableEventJsonLogger$Companion\n*L\n95#1:104,9\n95#1:113\n95#1:115\n95#1:116\n95#1:114\n*E\n"})
/*     */   public static final class Companion { private Companion() {}
/*     */     @NotNull
/*     */     public final String serialize(@NotNull Iterable events, @NotNull SerializableEventJsonSerializer serializer) {
/*  88 */       Intrinsics.checkNotNullParameter(events, "events"); Intrinsics.checkNotNullParameter(serializer, "serializer"); return SequencesKt.joinToString$default(SequencesKt.map(CollectionsKt.asSequence(events), new SerializableEventJsonLogger$Companion$serialize$1(serializer)), "\n", null, null, 0, null, null, 62, null);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final List<SerializableEventWithMetadata> deserialize(@NotNull String data, @NotNull SerializableEventJsonSerializer serializer) {
/*  95 */       Intrinsics.checkNotNullParameter(data, "data"); Intrinsics.checkNotNullParameter(serializer, "serializer"); String[] arrayOfString = new String[1]; arrayOfString[0] = "\n"; Iterable $this$mapNotNull$iv = StringsKt.split$default(data, arrayOfString, false, 0, 6, null); int $i$f$mapNotNull = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 104 */       Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 112 */       Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 113 */       Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; String line = (String)element$iv$iv;
/*     */         int $i$a$-mapNotNull-SerializableEventJsonLogger$Companion$deserialize$1 = 0; }
/*     */       
/* 116 */       return (List<SerializableEventWithMetadata>)destination$iv$iv;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<SerializableEventWithMetadata> deserialize(@NotNull Path path) {
/*     */       Intrinsics.checkNotNullParameter(path, "path");
/*     */       Intrinsics.checkNotNullExpressionValue(Files.readString(path, Charsets.UTF_8), "readString(...)");
/*     */       return deserialize(Files.readString(path, Charsets.UTF_8), SerializableEventUpdatableSerializer.INSTANCE.getSerializer());
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\events\SerializableEventJsonLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */