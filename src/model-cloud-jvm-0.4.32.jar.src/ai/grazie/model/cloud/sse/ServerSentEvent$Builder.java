/*    */ package ai.grazie.model.cloud.sse;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\021\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\020\t\n\002\b\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\004\030\0002\0020\001B\027\022\020\b\002\020\002\032\n\022\004\022\0020\004\030\0010\003¢\006\002\020\005J\016\020\023\032\0020\0242\006\020\025\032\0020\004J\020\020\026\032\0020\0242\006\020\025\032\0020\004H\002J\006\020\027\032\0020\030J\006\020\031\032\0020\013J\022\020\032\032\004\030\0010\004*\0060\007j\002`\bH\002J\f\020\033\032\0020\004*\0020\004H\002R\022\020\006\032\0060\007j\002`\bX\004¢\006\002\n\000R\022\020\t\032\0060\007j\002`\bX\004¢\006\002\n\000R\016\020\n\032\0020\013X\016¢\006\002\n\000R\020\020\f\032\004\030\0010\004X\016¢\006\002\n\000R\020\020\r\032\004\030\0010\004X\016¢\006\002\n\000R\016\020\016\032\0020\017X\004¢\006\002\n\000R\022\020\020\032\004\030\0010\021X\016¢\006\004\n\002\020\022¨\006\034"}, d2 = {"Lai/grazie/model/cloud/sse/ServerSentEvent$Builder;", "", "lines", "", "", "([Ljava/lang/String;)V", "commentBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "dataBuilder", "entire", "", "event", "id", "logger", "Lai/grazie/utils/mpp/MPPLogger;", "retry", "", "Ljava/lang/Long;", "append", "", "line", "appendLine", "build", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "isEntire", "buildSSEText", "trimFirstSpace", "model-cloud"}) @SourceDebugExtension({"SMAP\nServerSentEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerSentEvent.kt\nai/grazie/model/cloud/sse/ServerSentEvent$Builder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n13402#2,2:97\n1#3:99\n*S KotlinDebug\n*F\n+ 1 ServerSentEvent.kt\nai/grazie/model/cloud/sse/ServerSentEvent$Builder\n*L\n49#1:97,2\n*E\n"}) public final class Builder { @NotNull private final MPPLogger logger; @NotNull private final StringBuilder dataBuilder; @NotNull private final StringBuilder commentBuilder; @Nullable private String event; @Nullable private String id; @Nullable private Long retry; private boolean entire; private final void appendLine(String line) { if (!StringsKt.isBlank(line)) {
/*    */       int colonIndex = StringsKt.indexOf$default(line, ":", 0, false, 6, null); Intrinsics.checkNotNullExpressionValue(line.substring(colonIndex + 1), "substring(...)"); Pair pair = (colonIndex == -1) ? TuplesKt.to(line, "") : TuplesKt.to(StringsKt.substring(line, RangesKt.until(0, colonIndex)), trimFirstSpace(line.substring(colonIndex + 1))); String field = (String)pair.component1(), value = (String)pair.component2();
/*    */       String str1 = field;
/*    */       switch (str1.hashCode()) {
/*    */         case 0:
/*    */           if (!str1.equals(""))
/*    */             break; 
/*    */           this.commentBuilder.append(value).append('\n');
/*    */           return;
/*    */         case 3076010:
/*    */           if (!str1.equals("data"))
/*    */             break; 
/*    */           this.dataBuilder.append(value).append('\n');
/*    */           return;
/*    */         case 3355:
/*    */           if (!str1.equals("id"))
/*    */             break; 
/*    */           this.id = value;
/*    */           return;
/*    */         case 96891546:
/*    */           if (!str1.equals("event"))
/*    */             break; 
/*    */           this.event = value;
/*    */           return;
/*    */         case 108405416:
/*    */           if (!str1.equals("retry"))
/*    */             break; 
/*    */           this.retry = Long.valueOf(Long.parseLong(value));
/*    */           return;
/*    */       } 
/*    */       MPPLogger.error$default(this.logger, null, new ServerSentEvent$Builder$appendLine$1(field), 1, null);
/*    */     } else {
/*    */       this.entire = true;
/*    */     }  } public Builder(@Nullable String[] lines) { String[] arrayOfString;
/*    */     byte b;
/*    */     int i;
/* 38 */     this.logger = LoggerFactory.INSTANCE.create("ai.grazie.model.cloud.sse.ServerSentEvent.Builder");
/*    */     
/* 40 */     this.dataBuilder = new StringBuilder();
/* 41 */     this.commentBuilder = new StringBuilder();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 49 */     if (lines != null) { arrayOfString = lines; int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 97 */       b = 0; i = arrayOfString.length; } else {  }  if (b < i) { Object element$iv = arrayOfString[b], object1 = element$iv; int $i$a$-forEach-ServerSentEvent$Builder$1 = 0; append((String)object1); }  }
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class ServerSentEvent$Builder$appendLine$1 extends Lambda implements Function0<String> {
/* 99 */     public final String invoke() { return "Not acceptable SSE event field received: " + this.$field + ", the line skipped. Correct event fields: id, event, data, retry and empty for comments"; } ServerSentEvent$Builder$appendLine$1(String $field) { super(0); } } public final void append(@NotNull String line) { Intrinsics.checkNotNullParameter(line, "line"); if (!(!this.entire ? 1 : 0)) { int $i$a$-require-ServerSentEvent$Builder$append$1 = 0; String str = "SSE event is already entire"; throw new IllegalArgumentException(str.toString()); }  appendLine(line); } public final boolean isEntire() { return this.entire; } @NotNull public final ServerSentEvent build() { if (!this.entire) { int $i$a$-require-ServerSentEvent$Builder$build$1 = 0; String str = "SSE event is not entire"; throw new IllegalArgumentException(str.toString()); }  return new ServerSentEvent(buildSSEText(this.dataBuilder), this.event, this.id, this.retry, buildSSEText(this.commentBuilder)); } private final String buildSSEText(StringBuilder $this$buildSSEText) { StringBuilder stringBuilder1 = $this$buildSSEText, it = stringBuilder1; int $i$a$-takeIf-ServerSentEvent$Builder$buildSSEText$1 = 0;
/*    */     (((it.length() > 0)) ? stringBuilder1 : null).toString();
/*    */     return ((((it.length() > 0)) ? stringBuilder1 : null) != null && (((it.length() > 0)) ? stringBuilder1 : null).toString() != null) ? StringsKt.dropLast((((it.length() > 0)) ? stringBuilder1 : null).toString(), 1) : null; }
/*    */ 
/*    */   
/*    */   private final String trimFirstSpace(String $this$trimFirstSpace) {
/*    */     byte b = 32;
/*    */     if (StringsKt.firstOrNull($this$trimFirstSpace) == null) {
/*    */       StringsKt.firstOrNull($this$trimFirstSpace);
/*    */     } else if (StringsKt.firstOrNull($this$trimFirstSpace).charValue() == b) {
/*    */       Intrinsics.checkNotNullExpressionValue($this$trimFirstSpace.substring(1), "substring(...)");
/*    */     } 
/*    */     return $this$trimFirstSpace;
/*    */   }
/*    */   
/*    */   public Builder() {
/*    */     this(null, 1, null);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\ServerSentEvent$Builder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */