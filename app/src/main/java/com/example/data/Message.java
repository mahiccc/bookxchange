package com.example.data;

import androidx.fragment.app.FragmentTransaction;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0012HÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001b¨\u0006L"}, d2 = {"Lcom/example/data/Message;", "", "id", "", "bookId", "sender", "receiver", "participants", "", "content", "timestamp", "", "status", "messageType", "swapOfferedBookId", "swapOfferedBookTitle", "swapOfferedBookImageUrl", "borrowDurationDays", "", "offerStatus", "meetupLocation", "meetupAddress", "meetupTime", "meetupStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getBookId", "getSender", "getReceiver", "getParticipants", "()Ljava/util/List;", "getContent", "getTimestamp", "()J", "getStatus", "getMessageType", "getSwapOfferedBookId", "getSwapOfferedBookTitle", "getSwapOfferedBookImageUrl", "getBorrowDurationDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOfferStatus", "getMeetupLocation", "getMeetupAddress", "getMeetupTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMeetupStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/example/data/Message;", "equals", "", "other", "hashCode", "toString", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Message {
    public static final int $stable = 8;
    private final String bookId;
    private final Integer borrowDurationDays;
    private final String content;
    private final String id;
    private final String meetupAddress;
    private final String meetupLocation;
    private final String meetupStatus;
    private final Long meetupTime;
    private final String messageType;
    private final String offerStatus;
    private final List<String> participants;
    private final String receiver;
    private final String sender;
    private final String status;
    private final String swapOfferedBookId;
    private final String swapOfferedBookImageUrl;
    private final String swapOfferedBookTitle;
    private final long timestamp;

    public Message() {
        this(null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, String str4, List list, String str5, long j, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12, String str13, Long l, String str14, int i, Object obj) {
        String str15;
        Long l2;
        String str16 = (i & 1) != 0 ? message.id : str;
        String str17 = (i & 2) != 0 ? message.bookId : str2;
        String str18 = (i & 4) != 0 ? message.sender : str3;
        String str19 = (i & 8) != 0 ? message.receiver : str4;
        List list2 = (i & 16) != 0 ? message.participants : list;
        String str20 = (i & 32) != 0 ? message.content : str5;
        long j2 = (i & 64) != 0 ? message.timestamp : j;
        String str21 = (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? message.status : str6;
        String str22 = (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? message.messageType : str7;
        String str23 = (i & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? message.swapOfferedBookId : str8;
        String str24 = (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? message.swapOfferedBookTitle : str9;
        String str25 = (i & 2048) != 0 ? message.swapOfferedBookImageUrl : str10;
        Integer num2 = (i & 4096) != 0 ? message.borrowDurationDays : num;
        String str26 = str16;
        String str27 = (i & FragmentTransaction.TRANSIT_EXIT_MASK) != 0 ? message.offerStatus : str11;
        String str28 = (i & 16384) != 0 ? message.meetupLocation : str12;
        String str29 = (i & 32768) != 0 ? message.meetupAddress : str13;
        Long l3 = (i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.meetupTime : l;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            l2 = l3;
            str15 = message.meetupStatus;
        } else {
            str15 = str14;
            l2 = l3;
        }
        return message.copy(str26, str17, str18, str19, list2, str20, j2, str21, str22, str23, str24, str25, num2, str27, str28, str29, l2, str15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSwapOfferedBookId() {
        return this.swapOfferedBookId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSwapOfferedBookTitle() {
        return this.swapOfferedBookTitle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSwapOfferedBookImageUrl() {
        return this.swapOfferedBookImageUrl;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getBorrowDurationDays() {
        return this.borrowDurationDays;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getOfferStatus() {
        return this.offerStatus;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMeetupLocation() {
        return this.meetupLocation;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getMeetupAddress() {
        return this.meetupAddress;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Long getMeetupTime() {
        return this.meetupTime;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getMeetupStatus() {
        return this.meetupStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBookId() {
        return this.bookId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSender() {
        return this.sender;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReceiver() {
        return this.receiver;
    }

    public final List<String> component5() {
        return this.participants;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    public final Message copy(String id, String bookId, String sender, String receiver, List<String> participants, String content, long timestamp, String status, String messageType, String swapOfferedBookId, String swapOfferedBookTitle, String swapOfferedBookImageUrl, Integer borrowDurationDays, String offerStatus, String meetupLocation, String meetupAddress, Long meetupTime, String meetupStatus) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bookId, "bookId");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(participants, "participants");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        return new Message(id, bookId, sender, receiver, participants, content, timestamp, status, messageType, swapOfferedBookId, swapOfferedBookTitle, swapOfferedBookImageUrl, borrowDurationDays, offerStatus, meetupLocation, meetupAddress, meetupTime, meetupStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return Intrinsics.areEqual(this.id, message.id) && Intrinsics.areEqual(this.bookId, message.bookId) && Intrinsics.areEqual(this.sender, message.sender) && Intrinsics.areEqual(this.receiver, message.receiver) && Intrinsics.areEqual(this.participants, message.participants) && Intrinsics.areEqual(this.content, message.content) && this.timestamp == message.timestamp && Intrinsics.areEqual(this.status, message.status) && Intrinsics.areEqual(this.messageType, message.messageType) && Intrinsics.areEqual(this.swapOfferedBookId, message.swapOfferedBookId) && Intrinsics.areEqual(this.swapOfferedBookTitle, message.swapOfferedBookTitle) && Intrinsics.areEqual(this.swapOfferedBookImageUrl, message.swapOfferedBookImageUrl) && Intrinsics.areEqual(this.borrowDurationDays, message.borrowDurationDays) && Intrinsics.areEqual(this.offerStatus, message.offerStatus) && Intrinsics.areEqual(this.meetupLocation, message.meetupLocation) && Intrinsics.areEqual(this.meetupAddress, message.meetupAddress) && Intrinsics.areEqual(this.meetupTime, message.meetupTime) && Intrinsics.areEqual(this.meetupStatus, message.meetupStatus);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.id.hashCode() * 31) + this.bookId.hashCode()) * 31) + this.sender.hashCode()) * 31) + this.receiver.hashCode()) * 31) + this.participants.hashCode()) * 31) + this.content.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.status.hashCode()) * 31) + this.messageType.hashCode()) * 31;
        String str = this.swapOfferedBookId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.swapOfferedBookTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.swapOfferedBookImageUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.borrowDurationDays;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.offerStatus;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.meetupLocation;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.meetupAddress;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.meetupTime;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.meetupStatus;
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "Message(id=" + this.id + ", bookId=" + this.bookId + ", sender=" + this.sender + ", receiver=" + this.receiver + ", participants=" + this.participants + ", content=" + this.content + ", timestamp=" + this.timestamp + ", status=" + this.status + ", messageType=" + this.messageType + ", swapOfferedBookId=" + this.swapOfferedBookId + ", swapOfferedBookTitle=" + this.swapOfferedBookTitle + ", swapOfferedBookImageUrl=" + this.swapOfferedBookImageUrl + ", borrowDurationDays=" + this.borrowDurationDays + ", offerStatus=" + this.offerStatus + ", meetupLocation=" + this.meetupLocation + ", meetupAddress=" + this.meetupAddress + ", meetupTime=" + this.meetupTime + ", meetupStatus=" + this.meetupStatus + ")";
    }

    public Message(String str, String str2, String str3, String str4, List<String> list, String str5, long j, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12, String str13, Long l, String str14) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "bookId");
        Intrinsics.checkNotNullParameter(str3, "sender");
        Intrinsics.checkNotNullParameter(str4, "receiver");
        Intrinsics.checkNotNullParameter(list, "participants");
        Intrinsics.checkNotNullParameter(str5, "content");
        Intrinsics.checkNotNullParameter(str6, "status");
        Intrinsics.checkNotNullParameter(str7, "messageType");
        this.id = str;
        this.bookId = str2;
        this.sender = str3;
        this.receiver = str4;
        this.participants = list;
        this.content = str5;
        this.timestamp = j;
        this.status = str6;
        this.messageType = str7;
        this.swapOfferedBookId = str8;
        this.swapOfferedBookTitle = str9;
        this.swapOfferedBookImageUrl = str10;
        this.borrowDurationDays = num;
        this.offerStatus = str11;
        this.meetupLocation = str12;
        this.meetupAddress = str13;
        this.meetupTime = l;
        this.meetupStatus = str14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Message(String str, String str2, String str3, String str4, List list, String str5, long j, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12, String str13, Long l, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String string;
        if ((i & 1) != 0) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else {
            string = str;
        }
        this(string, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? System.currentTimeMillis() : j, (i & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "SENT" : str6, (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? "TEXT" : str7, (i & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str8, (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : num, (i & FragmentTransaction.TRANSIT_EXIT_MASK) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (i & 32768) != 0 ? null : str13, (i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : l, (i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : str14);
    }

    public final String getId() {
        return this.id;
    }

    public final String getBookId() {
        return this.bookId;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getReceiver() {
        return this.receiver;
    }

    public final List<String> getParticipants() {
        return this.participants;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final String getSwapOfferedBookId() {
        return this.swapOfferedBookId;
    }

    public final String getSwapOfferedBookTitle() {
        return this.swapOfferedBookTitle;
    }

    public final String getSwapOfferedBookImageUrl() {
        return this.swapOfferedBookImageUrl;
    }

    public final Integer getBorrowDurationDays() {
        return this.borrowDurationDays;
    }

    public final String getOfferStatus() {
        return this.offerStatus;
    }

    public final String getMeetupLocation() {
        return this.meetupLocation;
    }

    public final String getMeetupAddress() {
        return this.meetupAddress;
    }

    public final Long getMeetupTime() {
        return this.meetupTime;
    }

    public final String getMeetupStatus() {
        return this.meetupStatus;
    }
}
